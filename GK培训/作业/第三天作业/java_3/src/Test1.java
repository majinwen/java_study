import java.util.Arrays;

public class Test1 {
    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5};
        int[][] arr2 ={{7,8,9},{10,11,12,14},{15,17,20,21,55}};
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
        for(int[] i:arr2){
            System.out.println();
            for(int j:i){
                System.out.print(j+" ");
            }
        }

    }
}
