package TTT;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/***************************************
 *made by pengyao1207
 * create:2018/01/31 21:41
 ***************************************/
public class Ys {
    public static void main(String[] args){
        //HashMap<Integer,Integer> sj = new HashMap<Integer, Integer>();
        int k=2000;
        int [] a= new int[4000001/2+1];
        for(int y=1;y<=k;y++){
            for(int x=1;x<=y;x++){
                if((x*y)%(x+y)==0){
                    if(x*y/(x+y)==5) {
                        System.out.println(x+":"+y);
                        System.out.println(x * y);
                        System.out.println(x + y);
                        System.out.println("n==" + x * y / (x + y));
                    }
                    a[(x*y)/(x+y)]++;
                }
            }
        }
        //Arrays.sort(a);
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            if(a[i]!=0) {
                System.out.println(i + ":" + a[i]);
            }
        }
    }
}
