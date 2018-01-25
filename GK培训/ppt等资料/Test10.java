/**
 * Created by yangbo on 2018/1/25.
 */
public class Test10 {

    public static void main(String[] args) {
//        int[] ary1 = {10,9,8,7,6,5};
//        for(int i = 0; i < ary1.length;i++){
//            System.out.print(ary1[i] + ",");
//        }


        int[][] ary2 = {
                {7,8,9},
                {10,11,12,14},
                {15,17,20,21,55}
        };

        for(int i = 0; i < ary2.length;i++){
            for(int j =0; j < ary2[i].length;j++){
                System.out.print(ary2[i][j] + ",");
            }
            System.out.println();
        }

    }
}
