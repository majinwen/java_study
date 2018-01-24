public class T_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.println();
            for (int j = 1; j <= 6 - i + 1; j++) {
                System.out.print("*");
            }
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }
        }
    }
}
