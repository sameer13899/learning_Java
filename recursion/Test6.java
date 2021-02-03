public class Test6 {
    public static int arraySum(int input[]) {
        if (input.length < 1) {
            return 0;
        }
        int smallInput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }
        int smallAns = arraySum(smallInput);
        return input[0] + smallAns;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 20, 32 };
        System.out.println(arraySum(arr));
    }
}