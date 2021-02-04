import java.util.Scanner;

public class Test16 {
    public static double findGeometricSum(int k) {
        if (k == 0)
            return 1;
        return findGeometricSum(k - 1) + 1 / Math.pow(2, k);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println(findGeometricSum(k));
    }
}
