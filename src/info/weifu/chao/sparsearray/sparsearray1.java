package info.weifu.chao.sparsearray;

public class sparsearray1 {
    public static void main(String[] args) {
        //准备二维数组
        int[][] array = new int[11][11];
        //设置有效值
        array[3][3] = 1;
        array[9][4] = 1;
        array[10][4] = 1;
        //打印原始二维数组
        System.out.println("========================原始二位数组==================");
        printArray(array);
        //原始二维数组转稀疏数组
        System.out.println("========================转为稀疏数组==================");
        int[][] sparse = toSparse(array);
        printArray(sparse);
        System.out.println("========================转回原始二维数组==================");
        //稀疏数组转原始二维数组
        int[][] proto = toProto(sparse);
        printArray(proto);
    }

    /**
     * 转回原始二维数组
     * @param array
     * @return
     */
    private static int[][] toProto(int[][] array) {
        int[][] arr = new int[array[0][0]][array[0][1]];
        for (int i = 1; i <= array[0][2]; i++) {
            arr[array[i][0]][array[i][1]] = array[i][2];
        }
        return arr;
    }

    /**
     * 转为稀疏数组
     *
     * @param array
     * @return
     */
    private static int[][] toSparse(int[][] array) {
        //保存总有效值数
        int sum = 0;
        //遍历二维数组中所有有效值的总数sum
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    sum++;
                }
            }
        }
        //创建稀疏数组
        int[][] sparse = new int[sum + 1][3];
        //保存原始数组的基本信息
        sparse[0][0] = array.length;
        sparse[0][1] = array[0].length;
        sparse[0][2] = sum;
        //标记
        int count = 0;
        //保存有效值信息
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    count++;
                    sparse[count][0] = i;
                    sparse[count][1] = j;
                    sparse[count][2] = array[i][j];
                }
            }
        }
        return sparse;
    }

    /**
     * 打印出数组数据
     *
     * @param array
     */
    private static void printArray(int[][] array) {
        System.out.println("\t" + "0" + "\t" + "1" + "\t" + "2" + "\t" + "3" + "\t" + "4" + "\t" + "5" + "\t" + "6" + "\t" + "7" + "\t" + "8" + "\t" + "9" + "\t" + "10" + "\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
