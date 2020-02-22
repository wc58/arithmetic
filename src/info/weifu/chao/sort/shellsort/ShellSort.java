package info.weifu.chao.sort.shellsort;

import info.weifu.chao.sort.SortUtil;

public class ShellSort {

    /**
     * 希尔排序（冒泡实现）
     *
     * @param arrs
     */
    public static void shellSort(Comparable[] arrs) {
        for (int i = (arrs.length / 2); i > 0; i /= 2) {
            for (int k = i; k < arrs.length; k++) {
                int min = 0;
                for (int j = k - i; j >= 0; j -= i) {
                    if (SortUtil.more(arrs[j], arrs[j + i])) {
                        SortUtil.exch(arrs, j, j + i);
                    }
                }
            }
        }
    }

    /**
     * 希尔排序（插入实现）
     *
     * @param arrs
     */
    public static void shellSort2(Comparable[] arrs) {
        for (int i = (arrs.length / 2); i > 0; i /= 2) {
            for (int j = i; j < arrs.length; j++) {
                Comparable insertVal = arrs[j];
                int insertIndex = j - i;
                while (insertIndex >= 0 && SortUtil.more(arrs[insertIndex], insertVal)) {
                    arrs[insertIndex + i] = arrs[insertIndex];
                    insertIndex-=i;
                }
                arrs[insertIndex + i] = insertVal;
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] arrs = SortUtil.arr1();
        System.out.println("排序前：");
        SortUtil.show(arrs);
        long start = System.currentTimeMillis();
        shellSort2(arrs);
        long time = (System.currentTimeMillis() - start) / 1000;
        System.out.println("\n所耗时间：" + time + "秒\n排序后：");
        //打印结果
        SortUtil.show(arrs);
    }

}
