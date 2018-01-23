/**
 * 试运行如下代码：理解++与—前置后置的区别
 * @author pengyao1207
 * @date 2018/1/23
 * @version 1.0
 * @since 1.8
 */
public class Test05 {
    public static void main(String[] args){
        int x = 5;
        System.out.println("x= "+x);
        System.out.println("++x= "+(++x));
        System.out.println("x= "+x);
        System.out.println("--x= "+(--x));
        System.out.println("x= "+x);
        System.out.println("x++= "+(x++));
        System.out.println("x= "+x);
        System.out.println("x--= "+(x--));
        System.out.println("x= "+x);
    }
}
