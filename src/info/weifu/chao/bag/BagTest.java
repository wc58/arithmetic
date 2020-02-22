package info.weifu.chao.bag;

import java.util.Iterator;

public class BagTest {

    public static void main(String[] args) {
        Bag1<String> bag1 = new Bag1<>();
        bag1.add("aaa");
        bag1.add("bbb");
        bag1.add("ccc");
        Iterator<String> iterator = bag1.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
