import java.util.Scanner;

public class Test11 {
    private static int findLastIndex(int input[], int x, int i) {
        if (i == input.length) {
            return -1;
        }
        int smallAns = findLastIndex(input, x, i + 1);
        if (input[i] == x && smallAns == -1) {
            return i;
        }
        return smallAns;
    }

    public static int findLastIndex(int input[], int x) {
        return findLastIndex(input, x, 0);
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
