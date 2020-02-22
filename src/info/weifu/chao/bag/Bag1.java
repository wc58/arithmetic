package info.weifu.chao.bag;

import java.util.Iterator;

public class Bag1<Item> {

    private class Node {
        public Item item;
        public Node nest;
    }

    private Node first;

    /**
     * 添加元素到背包
     *
     * @param item
     */
    public void add(Item item) {
        Node temp = first;
        first = new Node();
        first.item = item;
        first.nest = temp;
    }

    public Iterator<Item> getIterator() {
        return new BagIterable();
    }

    private class BagIterable implements Iterator<Item> {
        @Override
        public boolean hasNext() {
            return first != null;
        }

        @Override
        public Item next() {
            Item item = first.item;
            first = first.nest;
            return item;
        }
    }
}
