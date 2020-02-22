package info.weifu.chao.stack;

import java.util.Iterator;

public class Stack4<Item> implements Iterator<Item> {

    private int n;
    private Node node;

    /**
     * 节点
     */
    private class Node {
        public Item item;
        public Node next;
    }

    /**
     * 压栈操作
     *
     * @param s
     */
    public void push(Item s) {
        Node newNode = new Node();
        newNode.item = s;
        newNode.next = node;
        node = newNode;
        n++;
    }

    /**
     * 出栈操作
     *
     * @return
     */
    public Item pop() {
        Item item = node.item;
        node = node.next;
        n--;
        return item;
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
     *
     * @return
     */
    public Iterator<Item> getIterable() {
        return new StackIterable();
    }

    /**
     * 迭代器
     */
    private class StackIterable implements Iterator<Item> {

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
