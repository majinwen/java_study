/**
 * 判断闰年
 * Created by pengyao1207 on 2018/1/24
 */
public class Test02 {
    public enum TestEnum1 {
        A, B, C
    }

    public static void main(String[] args) {
        int year = 500;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf(year + "是闰年！");
        } else {
            System.out.printf(year + "不是闰年");
        }

        TestEnum1 s = TestEnum1.A;
        System.out.println(s);

    }
}
