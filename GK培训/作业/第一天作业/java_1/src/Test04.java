/**
 * 定义两个整数并初始化，把两个数字输出，然后交换两个数字并且输出结果
 * @author pengyao1207
 * @date 2018/1/23
 * @version 1.0
 * @since 1.8
 */
public class Test04 {
    public static void main(String[] args){
        int a=3;
        int b=4;
        System.out.println("这两个数分别是："+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("交换后这两个数分别是："+a+" "+b);
    }
}
