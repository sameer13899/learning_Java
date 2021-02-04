import java.util.Scanner;

public class Test14 {
    public static int mMulN(int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        int smallAns = mMulN(m, n - 1);
        return m + smallAns;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(mMulN(m, n));
    }
}
