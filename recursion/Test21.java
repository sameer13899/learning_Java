public class Test21 {
    public static int ways(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        int smallAns = 0;
        for (int i = 1; i < 4; i++) {
            if (n - i >= 1) {
                smallAns += ways(n - i);
            }
        }
        return smallAns;
    }

    public static void main(String[] args) {
        System.out.println(ways(5));
    }
}