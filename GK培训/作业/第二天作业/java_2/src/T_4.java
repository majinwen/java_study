public class T_4 {
    public static void main(String[] args) {
        int a = 2345678;
        while (a != 0) {
            System.out.print(a % 10);
            a /= 10;
        }
    }
}
