import java.util.Scanner;

public class Test1 {
    public static int xPowerN(int x, int n) {
        if (n == 0)
            return 1;
        return x * xPowerN(x, n - 1);
    }

    public static int xPowerNFast(int x, int n) {
        if (n == 0)
            return 1;
        int small = xPowerNFast(x, n / 2);
        if (n % 2 == 0)
            return small * small;
        return x * small * small;
    }

    public static void main(String[] args) {
        // x power n
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.print(xPowerNFast(x, n));
    }
}