package info.weifu.chao.queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue1<String> queue1 = new Queue1<>();
        queue1.enqueue("aaa");
        queue1.enqueue("bbb");
        queue1.enqueue("ccc");
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
    }

}
