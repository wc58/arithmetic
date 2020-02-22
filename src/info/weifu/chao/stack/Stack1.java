package info.weifu.chao.stack;

public class Stack1 {

    private String[] strings;
    private int n;

    public Stack1(int size) {
        strings = new String[size];
    }

    /**
     * 压栈操作
     *
     * @param s
     */
    public void push(String s) {
        strings[n++] = s;
    }

    /**
     * 出栈操作
     *
     * @return
     */
    public String pop() {
        return strings[--n];
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
        return strings.length == n;
    }

}
