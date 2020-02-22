package info.weifu.chao.sort.bubblesort;

import info.weifu.chao.sort.SortUtil;

/**
 * 冒泡排序
 * 时间复杂度：O(n^2)
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * @param arrs
     */
    public static void bubbleSort(Comparable[] arrs) {
        //冒泡排序
        for (int i = arrs.length; i > 1; i--) {
//            System.out.println("\n--------------------开始-------------------");
            boolean flag = true;
            for (int j = 0; j < i - 1; j++) {
                if (SortUtil.more(arrs[j], arrs[j + 1])) {
                    SortUtil.exch(arrs, j, j + 1);
                    flag = false;
                }
//                SortUtil.show(arrs);
//                System.out.println();
            }
//            System.out.println("----------------------结束-----------------");
            if (flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        //准备数据
        Comparable[] arrs = SortUtil.arr4(80000);
        System.out.println("排序前：");
        SortUtil.show(arrs);
        long start = System.currentTimeMillis();
        bubbleSort(arrs);
        long time = (System.currentTimeMillis() - start) / 1000;
        System.out.println("\n所耗时间：" + time + "秒\n排序后：");
        //打印结果
        SortUtil.show(arrs);
    }

}
