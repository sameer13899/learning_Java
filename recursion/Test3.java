import java.util.Scanner;

public class Test3 {
    public static int countNoOfDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + countNoOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(countNoOfDigits(n));
    }
}
