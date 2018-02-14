package rand;

import static java.lang.Math.random;

/***************************************
 *made by pengyao1207
 * create:2018/02/01
 ***************************************/
public class Rand {
    private static boolean rand01() {//一个返回0，1的随机函数
        return !(random() > 0.5);
    }

    private static int rand2n(int n) {//得到2的n阶随机数
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            str.append(rand01() ? 0 : 1);
        }
        return Integer.parseInt(str.toString(), 2);
    }

    private static int getN(int sum) {//得到最小的阶数
        int n = 0;
        int s = 1;
        while (true) {
            n++;
            if (s >= sum) break;
            s *= 2;
        }
        return n;
    }

    public static int myRand(int m, int n) {//最终的随机函数
        int dd = n - m;
        int gn = getN(n - m);
        int re;
        while (true) {
            re = rand2n(gn);
            if (re <= dd) break;
        }
        return m + re;
    }

    public static void main(String... args) {//测试
        int[] a = new int[10];
        for (int i = 1; i <= 100000; i++) {
            a[myRand(1, 10) - 1]++;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
