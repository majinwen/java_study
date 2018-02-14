package rand;

import static java.lang.Math.random;

/***************************************
 *made by pengyao1207
 * create:2018/02/01 21:11
 ***************************************/
public class Rand1 {
    public static void main(String... args) {//测试
        int[] a = new int[2];
        for(int i=1;i<=100000;i++){
            a[newrand01()]++;
            // System.out.print(zzrand(1,10)+" ");
        }
        System.out.println(a[0]/(a[0]+a[1]+0.0));
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    private static int base_rand01(double pr){
        return random()<=pr?1:0;
    }
    private static int newrand01(){
        while(true) {
            boolean x=base_rand01(0.3)>base_rand01(0.3);
            boolean y=base_rand01(0.3)>base_rand01(0.3);
            if(x==true&&y==false)return 0;
            if(x==false&&y==true)return 1;
        }

    }

}
