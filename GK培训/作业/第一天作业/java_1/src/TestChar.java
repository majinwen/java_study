/**
 * 有一个小写的字母’f’，把它转换成自身的后4个字母的大写形式，并且把结果输出。如：a字母结果输出E(应用所学过的知识，不能用没学过的条件处理)
 * @author pengyao1207
 * @date 2018/1/23
 * @version 1.0
 * @since 1.8
 */
public class TestChar {
    public static void main(String[] args){
        char a='f';
        System.out.println("原字符："+a);
        char b= (char) (a+4+'A'-'a');
        System.out.println("转发后："+b);
    }
}
