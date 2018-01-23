/**
 * 编写程序 输出  char c1=’你’, c2=’a’; char 是=’ぁ’;  三个字符变量中字符对应的unicode码
 * @author pengyao1207
 * @date 2018/1/23
 * @version 1.0
 * @since 1.8
 */
public class PrintCharCode {
    public static void main(String[] args){
        char c1 = '你';
        char c2='a';
        char 是 = 'ぁ';
        System.out.println((int)c1);
        System.out.println((int)c2);
        System.out.println((int)是);
    }
}
