package imgproject;
import java.lang.reflect.Array;
import java.util.Arrays;
import static java.lang.Math.random;
/***************************************
 *made by pengyao1207
 * create:2018/02/01 12:21
 ***************************************/
public class ImgToGra {

    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i=1;i<=1000000;i++){
            a[zzrand(1,10)-1]++;
           // System.out.print(zzrand(1,10)+" ");
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    private static int zzrand(int k1,int k2){
        while(k1!=k2) {
            int s = mrand();
            if((k2-k1)%2==0) {
                if (s == 0) {
                    k2 -= ((k2 - k1) / 2)+mrand();
                } else {
                    k1 += ((k2 - k1) / 2)+mrand();
                }
            }
            else{
                if(k2-k1==1)return k1+mrand();
                if (s == 0) {
                    k2 -= ((k2 - k1) / 2)+1;
                } else {
                    k1 += ((k2 - k1) / 2)+1;
                }
            }
        }
        return k1;
    }
    private static int mrand() {//这个函数用于生产随机0,1
        return random()>0.5?0:1;
    }
}