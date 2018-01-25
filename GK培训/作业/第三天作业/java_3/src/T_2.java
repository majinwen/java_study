/*
有一个二维数组，循环输出所有元素值（注其中每一维一行）
made by pengyao1207
2018/1/25
 */
import java.util.Scanner;
public class T_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr = new int[n][];

        arr[0]= new int[]{1};
        for(int i=1;i<arr.length;i++){
            arr[i]= new int[i+1];
            arr[i][0]=1;
            for(int j=1;j<arr[i].length-1;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
            arr[i][i]=1;
        }

        for(int[] i:arr){
            System.out.println();
            for(int j:i){
                System.out.print(j+"\t");
            }
        }
    }
}
