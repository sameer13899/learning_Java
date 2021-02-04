import java.util.Scanner;

public class Test13 {
    public static int[] findIndexes(int input[], int x, int startIndex) {
        if (startIndex == input.length) {
            int output[] = new int[0];
            return output;
        }
        int smallOutput[] = findIndexes(input, x, startIndex + 1);
        if (input[startIndex] == x) {
            int output[] = new int[smallOutput.length + 1];
            output[0] = startIndex;
            for (int i = 0; i < smallOutput.length; i++) {
                output[i + 1] = smallOutput[i];
            }
            return output;
        }
        return smallOutput;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int x = in.nextInt();
        int b[] = findIndexes(a, x, 0);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}