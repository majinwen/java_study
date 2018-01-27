package day5;

/**********************************************
 * made by pengyao1207
 * 2018/01/27 17:13
 **********************************************/
public class TestFullTime {
    public static void main(String[] args) {
        FullTime fullTime = new FullTime(new MyTime(14, 17, 35)
                , new MyDate(2012, 12, 22));
        System.out.println(fullTime.toString());
    }
}
