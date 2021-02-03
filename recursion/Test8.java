import java.util.Scanner;

public class Test8 {
    private static boolean checkSortedBetter(int a[], int i) {
        if (i == a.length - 1)
            return true;
        if (a[i] > a[i + 1])
            return false;
        boolean smallAns = checkSortedBetter(a, i + 1);
        return smallAns;
    }

    public static boolean checkSortedBetter(int a[]) {
        return checkSortedBetter(a, 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.print(checkSortedBetter(a));
    }

}