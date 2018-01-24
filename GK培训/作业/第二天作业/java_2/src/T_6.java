public class T_6 {
    public static void main(String[] args) {
        int k = 6;
        for (int i = 1; i <= k; i++) {
            System.out.println();
            for (int j = 1; j <= k - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
        }
    }
}
