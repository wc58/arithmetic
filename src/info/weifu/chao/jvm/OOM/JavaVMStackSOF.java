package info.weifu.chao.jvm.OOM;

/**
 * VM Args：-Xss128k(设置栈容量)
 */
public class JavaVMStackSOF {

    private int stackLength = 0;

    public void stackLeak() {
        ++stackLength;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(javaVMStackSOF.stackLength);
        }
    }
}
