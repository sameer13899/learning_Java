import java.util.Scanner;

public class Test2 {
    public static void print1toN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print1toN(n);
    }
}
