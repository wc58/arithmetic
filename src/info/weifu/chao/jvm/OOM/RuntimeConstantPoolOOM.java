package info.weifu.chao.jvm.OOM;

import java.util.ArrayList;

/**
 * VM Args: -XX:PermSize=10m -XX:MaxPermSize=10m 限制方法区大小
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        int i = 0;
        while (true){
            //intern()方法：返回池中代表这个字符串地String对象，若没有，则在池中创建此String对象并返回
            strings.add(String.valueOf(i).intern());
        }
    }

}
