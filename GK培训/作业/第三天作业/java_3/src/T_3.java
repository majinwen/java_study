/*
有一个二维数组，找出该二维数组的鞍点，即该位置上的元素在该行
上最大，在该列上最小。也可能没有鞍点
made by pengyao1207
2018/1/25
*/
public class T_3 {
    public static void main(String[] args) {
        int[][] arr = {{21, 32, 31, 32, 65, 76, 45},
                        {1,   4,  2,  8,  5, 3,  1},
                        {54, 23, 87, 54, 34, 23, 54},
                        {98, 23, 3, 54, 24, 54,  98},
                        {19, 32, 34, 65, 34, 432, 2}
        };

        boolean kkk = true;//标记是否找到
        for (int[] anArr : arr) {
            int f = 0;//记录一行中最大的数
            for (int i = 0; i < anArr.length; i++) {
                if (anArr[i] > anArr[f]) {
                    f = i;
                }
            }

            boolean bj = true;//一行中最大的数是否是一列中最小的数
            for (int[] anArr1 : arr) {
                if (anArr1.length > f) {
                    if (anArr1[f] < anArr[f]) {
                        bj = false;
                    }
                }
            }
            if (bj) {
                kkk = false;
                System.out.println(anArr[f]);
            }
        }
        if (kkk) {
            System.out.println("没找到~~");
        }
    }
}
