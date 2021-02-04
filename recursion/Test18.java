import java.util.Scanner;

public class Test18 {
    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        int smallAns = sumOfDigits(n / 10);
        return n % 10 + smallAns;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
