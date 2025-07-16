import java.util.*;

public class String_Deletions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            processString(S);
        }
    }

    public static int processString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i <= sb.length() - 3) {
            char a = sb.charAt(i);
            char b = sb.charAt(i + 1);
            char c = sb.charAt(i + 2);
            if (a != b && b != c) {
                sb.deleteCharAt(i + 1);
                i = 0; // reset to beginning after deletion to handle overlaps
            } else {
                i++;
            }
        }
        return sb.length();
    }

}
