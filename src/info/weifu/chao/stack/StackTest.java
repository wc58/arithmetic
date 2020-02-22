package info.weifu.chao.stack;

import java.util.Iterator;

public class StackTest {

    public static void main(String[] args) {
        //测试栈1
       /* Stack1 stack1 = new Stack1(3);
        stack1.push("aaa");
        stack1.push("bbb");
        stack1.push("ccc");
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.isFull());
        System.out.println(stack1.size());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.size());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.isFull());*/
       //测试栈2
    /*    Stack2<StackTest> stack2 = new Stack2<StackTest>(2);
        stack2.push(new StackTest());
        stack2.push(new StackTest());
        System.out.println(stack2.isEmpty());
        System.out.println(stack2.isFull());
        System.out.println(stack2.size());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.size());
        System.out.println(stack2.isEmpty());
        System.out.println(stack2.isFull());*/


        //测试栈3
       /* Stack3<StackTest> stack3 = new Stack3<StackTest>(2);
        stack3.push(new StackTest());
        stack3.push(new StackTest());
        stack3.push(new StackTest());
        stack3.push(new StackTest());
        stack3.push(new StackTest());

 *//*       Iterator<StackTest> iterable = stack3.getIterable();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }*//*

        System.out.println(stack3.isEmpty());
        System.out.println(stack3.size());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.size());
        System.out.println(stack3.isEmpty());*/
        //测试栈4
        Stack4<String> stack4 = new Stack4<>();
        stack4.push("aaa");
        stack4.push("bbb");
        stack4.push("ccc");
        System.out.println(stack4.isEmpty());
        System.out.println(stack4.size());
        Iterator<String> iterable = stack4.getIterable();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }
    }
}
