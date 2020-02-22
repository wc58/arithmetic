package info.weifu.chao.jvm.OOM;

/**
 * VM Args：-Xss128k(设置栈容量)
 *
 * 通过不断的建立线程，每个线程独立一个虚拟机栈，导致内存溢出
 */
public class JavaVMStackOOM {

    private int stackLength = 0;

    public void stackLeak() {
        System.out.println(++stackLength);
        stackLeak();
    }

    private void dontStop(){
        while (true){
            //不断给栈中添加栈帧
            stackLeak();
        }
    }

    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //不断创建新的线程(虚拟机栈)
                    dontStop();
                }
            });
            //启动线程
            thread.start();
        }
    }
    public static void main(String[] args) {
        JavaVMStackOOM javaVMStackOOM = new JavaVMStackOOM();
        javaVMStackOOM.stackLeakByThread();
    }
}
