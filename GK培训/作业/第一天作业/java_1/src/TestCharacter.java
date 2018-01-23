/**
 * 编写程序实现简单加密与解密
 * @author pengyao1207
 * @date 2018/1/23
 * @version 1.0
 * @since 1.8
 */
public class TestCharacter {
    public static void main(String[] args){
        char a='A';
        System.out.println("原字符："+a);
        char b=(char)(a+1);
        System.out.println("加密后："+b);
        char c=(char)(b-1);
        System.out.println("解密后："+c);
    }
}
