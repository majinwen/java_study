/**
 * Created by yangbo on 2018/1/25.
 */
public class HomeWork4_3 {
    public static void main(String[] args) {
        int[][] arr = {
                {21,32,31,32,65,76,45},
                {1,  4, 2, 8,  5, 3, 1},
                {54,23,87,54,34,23,54},
                {98,23,3,54,24,54,98},
                {19,32,34,65,34,432,2}
        };

        for(int i = 0; i < arr.length; i++){
            int max = 0;
            int col = 0;

            for(int j = 0; j < arr[i].length; j++){     // 循环一行
                if(arr[i][j] > max){
                    max = arr[i][j];
                    col = j;
                }
            }

            int min = arr[i][col];          // 最小值初始化为此行最大值
            for(int k = 0; k < arr.length; k++){
                if(min > arr[k][col]){
                    min = arr[k][col];
                }
            }

            if(min == max){
                System.out.println("鞍点是：" + max);
            }
        }
    }
}
