package info.weifu.chao.sort.selectsort;

import info.weifu.chao.sort.SortUtil;

public class SelectSort {

    /**
     * 选择排序
     * @param arrs
     */
    public static void selectSort(Comparable[] arrs) {
        int min = 0;
        for (int i = 0; i < arrs.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arrs.length; j++) {
                if (SortUtil.more(arrs[min], arrs[j])) {
                   min = j;
                }
            }
            SortUtil.exch(arrs,min,i);
        }

    }

    public static void main(String[] args) {
        Comparable[] arrs = SortUtil.arr4(80000);
        System.out.println("排序前：");
        SortUtil.show(arrs);
        long start = System.currentTimeMillis();
        selectSort(arrs);
        long time = (System.currentTimeMillis() - start) / 1000;
        System.out.println("\n所耗时间：" + time + "秒\n排序后：");
        //打印结果
        SortUtil.show(arrs);
    }

}
