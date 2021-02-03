import java.util.Scanner;

public class Test12 {
    public static int findIndexes(int[] a, int[] b, int x, int i, int j) {
        if (i == a.length) {
            return j;
        }
        if (a[i] == x) {
            b[j] = i;
            j++;
        }
        int smallAns = findIndexes(a, b, x, i + 1, j);
        return smallAns;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int x = in.nextInt();
        int[] b = new int[n];
        int l = findIndexes(a, b, x, 0, 0);
        if (l == 0) {

            System.out.print(0 + " ");
        } else {
            for (int i = 0; i < l; i++) {
                System.out.print(b[i] + " ");
            }
        }
    }

}