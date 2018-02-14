package rand;

/***************************************
 *made by pengyao1207
 * create:2018/02/01 20:59
 ***************************************/
public class RandTest {
    public static void main(String... args) {
        int[] a = new int[10];
        for (int i = 1; i <= 100000; i++) {
            a[Rand.myRand(1, 10) - 1]++;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
