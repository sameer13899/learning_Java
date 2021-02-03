import java.util.Scanner;

public class Test10 {
    private static int findLastIndex(int input[], int x, int i) {
        if (i < 0) {
            return -1;
        }
        if (input[i] == x)
            return i;
        int smallAns = findLastIndex(input, x, i - 1);
        return smallAns;
    }

    public static int findLastIndex(int input[], int x) {
        return findLastIndex(input, x, input.length - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int x = in.nextInt();
        System.out.print(findLastIndex(a, x));
    }
}
