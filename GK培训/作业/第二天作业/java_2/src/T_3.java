public class T_3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int b1 = 1;
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println(a + "/" + b);
            sum += (double) a / b;
            a += b;
            b = b1 + b;
            b1 = b - b1;
        }
        System.out.println("sum==" + sum);
    }
}
