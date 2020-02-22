package info.weifu.chao.sort;

import com.sun.xml.internal.txw2.DatatypeWriter;

public class SortUtil {

    /**
     * 全部无序
     *
     * @return
     */
    public static Comparable[] arr1() {
        Comparable[] arr = {3, 9, -1, 10, -2,5};
        return arr;
    }

    /**
     * 部分有序
     *
     * @return
     */
    public static Comparable[] arr2() {
        Comparable[] arr = {3, 9, -1, 10, 20};
        return arr;
    }

    /**
     * 全部有序
     *
     * @return
     */
    public static Comparable[] arr3() {
        Comparable[] arr = {3, 4, 5, 6, 7};
        return arr;
    }

    /**
     * 随机产生size个数据
     * @param size
     * @return
     */
    public static Comparable[] arr4(int size) {
        Comparable[] arr = new Comparable[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * size);
        }
        return arr;
    }

    /**
     * 判断前者是否小于后者
     *
     * @param v
     * @param m
     * @return
     */
    public static boolean less(Comparable v, Comparable m) {
        //v < m = -1
        return v.compareTo(m) < 0;
    }

    /**
     * 判断前者是否大于后者
     *
     * @param v
     * @param m
     * @return
     */
    public static boolean more(Comparable v, Comparable m) {
        //v > m = 1
        return v.compareTo(m) > 0;
    }

    /**
     * 前者索引与后者索引交换位置
     *
     * @param arr
     * @param i
     * @param j
     * @return
     */
    public static Comparable[] exch(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    /**
     * 验证排序是否正常
     *
     * @param arr
     * @param sort
     * @return
     */
    public static boolean isSorted(Comparable[] arr, int sort) {
        for (int i = 1; i < arr.length; i++) {
            if ("ASC".equals(sort)) {
                if (!less(arr[i - 1], arr[i])) {
                    return false;
                }
            } else if ("DESC".equals(sort)) {
                if (!more(arr[i - 1], arr[i])) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * 展示数组内容
     *
     * @param arr
     */
    public static void show(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
