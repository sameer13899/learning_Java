import java.util.Scanner;

public class Test20 {
    public static boolean helper(String input) {
        if (input.length() == 0)
            return true;
        if (input.charAt(0) == 'a') {
            if (input.substring(1).length() > 1 && input.substring(1, 3).equals("bb")) {
                return helper(input.substring(3));
            } else
                return helper(input.substring(1));
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(helper(s));
    }
}