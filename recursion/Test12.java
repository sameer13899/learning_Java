import java.util.Scanner;

public class Test12 {
    public static void findIndexes(int[] a, int[] b, int x, int i, int j) {
        if (i == a.length)
            return;
        if (a[i] == x) {
            b[j] = i;
            j++;
        }
        findIndexes(a, b, x, i + 1, j);
    }

    public static void findIndexes(int[] a, int x) {
        int[] b = new int[a.length];
        findIndexes(a, b, x, 0, 0);
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) {
                break;
            }
            System.out.print(b[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int x = in.nextInt();
        findIndexes(a, x);
    }

}