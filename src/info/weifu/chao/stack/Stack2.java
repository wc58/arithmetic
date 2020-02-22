package info.weifu.chao.stack;

public class Stack2<Item> {

    private Item[] items;
    private int n;

    public Stack2(int size) {
        //不能用泛型创建数组，只能强转
        items = (Item[]) new Object[size];
    }

    /**
     * 压栈操作
     *
     * @param s
     */
    public void push(Item s) {
        items[n++] = s;
    }

    /**
     * 出栈操作
     *
     * @return
     */
    public Item pop() {
        return items[--n];
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

    /**
     * 判断栈是否满
     *
     * @return
     */
    public boolean isFull() {
        return items.length == n;
    }

}
