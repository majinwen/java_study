/*
求所有不超过200的n值，n的平方是具有对称性质的回文数。所谓回文数
就是将一个数从左向右读与从右向左读是一样的。
例如：3443和1234321都是回文数
made by pengyao1207
2018/1/25
 */
public class T_4 {
    public static void main(String[] args){
        for(int i=0;i<=200;i++){
            boolean bj = true;
            String s = String.valueOf(i*i);
            for(int k=0;k<s.length()/2;k++){
                if(s.charAt(k)!=s.charAt(s.length()-k-1)){
                    bj=false;
                }
            }
            if(bj){
                System.out.println("n="+i+" n*n="+i*i);
            }
        }
    }
}
