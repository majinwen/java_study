/*
定义一个一维数组, 并输出一维数组中所有元素值,并查找最大的元素值
made by pengyao1207
2018/1/25
 */

import java.util.Arrays;

public class T_1 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 6, 3, 8, 0, 67, 3, 2, 43, 54, 65, 76, 45, 87, 89, 76, 54, 23, 54, 43, 542, 45};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("最大的数是" + arr[arr.length - 1]);
    }
}
