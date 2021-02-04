import java.util.Scanner;

public class Test17 {
    public static boolean findPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return findPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(findPalindrome(s));
    }
}
