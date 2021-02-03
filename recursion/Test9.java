import java.util.Scanner;

public class Test9 {
    private static int findIndex(int input[], int x, int i) {
        if (i == input.length) {
            return -1;
        }
        if (input[i] == x)
            return i;
        int smallAns = findIndex(input, x, i + 1);
        return smallAns;
    }

    public static int findIndex(int input[], int x) {
        return findIndex(input, x, 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int x = in.nextInt();
        System.out.print(findIndex(a, x));
    }
}
