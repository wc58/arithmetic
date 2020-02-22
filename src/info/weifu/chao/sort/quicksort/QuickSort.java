package info.weifu.chao.sort.quicksort;

import info.weifu.chao.sort.SortUtil;

public class QuickSort {

    public static void quickSort(Comparable[] arrs, int l, int r) {
        int left = l;
        int mid = ((r + l) / 2);
        int right = r;

        while (left < right) {
            while (SortUtil.less(arrs[left], arrs[mid])) {
                left++;
            }
            while (SortUtil.more(arrs[right], arrs[mid])) {
                right--;
            }
            if (left >= right) {
                break;
            }
            SortUtil.exch(arrs, left, right);
          /*  if (arrs[left] == arrs[mid]) {
                right--;
            }
            if (arrs[right] == arrs[mid]) {
                left++;
            }*/
        }

        if (left == right) {
            left++;
            right--;
        }

        if (left < r) {
            quickSort(arrs, left, r);
        }
        if (right > l) {
            quickSort(arrs, l, right);
        }

    }

    public static void main(String[] args) {
        Comparable[] arrs = SortUtil.arr1();
        System.out.println("排序前：");
        SortUtil.show(arrs);
        long start = System.currentTimeMillis();
        quickSort(arrs, 0, (arrs.length - 1));
        long time = (System.currentTimeMillis() - start) / 1000;
        System.out.println("\n所耗时间：" + time + "秒\n排序后：");
        //打印结果
        SortUtil.show(arrs);
    }

}
