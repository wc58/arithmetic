package info.weifu.chao.sort.insertsort;

import info.weifu.chao.sort.SortUtil;

public class InsertSort {

    /**
     * 插入排序
     *
     * @param arrs
     */
    public static void insertSort(Comparable[] arrs) {
        for (int i = 1; i < arrs.length; i++) {
            Comparable insertVal = arrs[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && SortUtil.more(arrs[insertIndex], insertVal)) {
                arrs[insertIndex + 1] = arrs[insertIndex];
                insertIndex--;
            }
            arrs[insertIndex + 1] = insertVal;
        }
    }

    public static void main(String[] args) {
        Comparable[] arrs = SortUtil.arr4(80000);
        System.out.println("排序前：");
        SortUtil.show(arrs);
        long start = System.currentTimeMillis();
        insertSort(arrs);
        long time = (System.currentTimeMillis() - start) / 1000;
        System.out.println("\n所耗时间：" + time + "秒\n排序后：");
        //打印结果
        SortUtil.show(arrs);
    }

}
