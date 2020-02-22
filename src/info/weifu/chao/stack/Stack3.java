package info.weifu.chao.stack;

import java.util.Iterator;

public class Stack3<Item> implements Iterator<Item> {

    private Item[] items;
    private int n;

    public Stack3(int size) {
        //不能用泛型创建数组，只能强转
        items = (Item[]) new Object[size];
    }

    /**
     * 压栈操作
     *
     * @param s
     */
    public void push(Item s) {
        //数组动态调整
        if (n > (items.length / 2)) {
            //扩容2/1
            reSize((int) (items.length * 1.5));
        }
        items[n++] = s;
    }

    /**
     * 出栈操作
     *
     * @return
     */
    public Item pop() {
        Item item = items[--n];
        //对象游离
        items[n] = null;
        //数组动态调整
        if (n <= (items.length / 4)) {
            //缩小2/1
            reSize((int) (items.length / 2));
        }
        return item;
    }

    /**
     * 重新调整数组大小
     *
     * @param size
     */
    private void reSize(int size) {
        Item[] temp = (Item[]) new Object[size];
        for (int i = 0; i < n; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    /**
     * 查看栈大小
     *
     * @return
     */
    public int size() {
        return n;
    }

    /**
     * 判断栈是否空
     *
     * @return
     */
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public boolean hasNext() {
        return !this.isEmpty();
    }

    @Override
    public Item next() {
        return this.pop();
    }

    /**
     * 获取迭代器
     * @return
     */
    public Iterator<Item> getIterable(){
        return new StackIterable();
    }

    /**
     * 迭代器
     */
    private class StackIterable implements Iterator<Item>{

        @Override
        public boolean hasNext() {
            return !isEmpty();
        }

        @Override
        public Item next() {
            return pop();
        }
    }
}
