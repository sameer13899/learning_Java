import java.util.Scanner;

public class Test15 {
    public static int countZeroes(int n) {
        if (n < 10) {
            if (n == 0)
                return 1;
            return 0;
        }
        int smallAns = countZeroes(n / 10);
        if (n % 10 == 0)
            return smallAns + 1;
        return smallAns;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countZeroes(n));
    }
}
