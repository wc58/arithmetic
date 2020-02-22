package info.weifu.chao.queue;

public class Queue1<Item> {

    private class Node {
        public Item item;
        private Node nest;
    }

    private Node first;
    private Node last;
    private int n;

    /**
     * 查看队列大小
     * @return
     */
    public int size() {
        return n;
    }

    /**
     * 判断队列是否空
     * @return
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * 进队列操作
     * @param item
     */
    public void enqueue(Item item) {
        //保存当前链表最后一个节点
        Node temp = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) {
            first = last;
        } else {
            temp.nest = last;
        }
        n++;
    }

    /**
     * 出队列操作
     * @return
     */
    public Item dequeue() {
        Item item = first.item;
        first = first.nest;
        n--;
        return item;
    }

}
