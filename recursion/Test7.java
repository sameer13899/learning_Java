import java.util.Scanner;

public class Test7 {
    public static boolean isXThere(int[] arr, int x, int i) {
        if (i >= arr.length)
            return false;
        if (arr[i] == x)
            return true;
        boolean smallAns = isXThere(arr, x, i + 1);
        return smallAns;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int x = in.nextInt();
        System.out.println(isXThere(arr, x, 0));
    }
}
