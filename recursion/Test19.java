import java.util.Scanner;

public class Test19 {
    public static String[] findSubsequences(String s) {
        if (s.length() == 0) {
            String ans[] = { "" };
            return ans;
        }
        String[] smallAns = findSubsequences(s.substring(1));
        String[] ans = new String[2 * smallAns.length];
        for (int i = 0; i < smallAns.length; i++) {
            ans[i] = smallAns[i];
        }
        for (int i = 0; i < smallAns.length; i++) {
            ans[i + smallAns.length] = s.charAt(0) + smallAns[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] ans = findSubsequences(s);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
