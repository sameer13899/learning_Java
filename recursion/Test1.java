import java.util.Scanner;

public class Test1 {
    public static int xPowerN(int x, int n) {
        if (n == 0)
            return 1;
        return x * xPowerN(x, n - 1);
    }

    public static void main(String[] args) {
        // x power n
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.print(xPowerN(x, n));
    }
}