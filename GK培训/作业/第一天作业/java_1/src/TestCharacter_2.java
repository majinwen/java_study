/**
 * @author pengyao1207
 * @date 2018/1/23
 * @version 1.0
 * @since 1.8
 */
public class TestCharacter_2 {
    public static void main(String[] args){
        String a="ABCDEF";
        System.out.println(a);
        String b=jm(a);
        System.out.println(b);
        String c=unjm(b);
        System.out.println(c);
    }

    private static String unjm(String a) {//解密
        StringBuilder b= new StringBuilder();
        for(int i=0;i<a.length();i++){
            b.append((char) (a.charAt(i) ^ 'D'));
        }
        return b.toString();
    }

    private static String jm(String a) {//加密
        StringBuilder b = new StringBuilder();
        for(int i=0;i<a.length();i++){
            b.append((char) (a.charAt(i) ^ 'D'));
        }
        return b.toString();
    }
}
