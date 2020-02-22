package info.weifu.chao.jvm.OOM;

import java.util.ArrayList;

/**
 * VM Args: -Xms20m(堆最小值) -Xmx20m(堆最大值) -XX:+HeapDumpOnOutOfMemoryError(内存溢出dump出堆转储快照)
 * Java堆溢出
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        ArrayList<OOMObject> oomObjects = new ArrayList<>();
        int i = 0;
        while(true){
            System.out.println(++i);
            oomObjects.add(new OOMObject());
        }
    }

}
