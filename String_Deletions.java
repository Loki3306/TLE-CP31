import java.util.*;

public class String_Deletions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            System.out.println(processString(S)); // <-- FIXED THIS LINE
        }
    }

    public static int processString(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            boolean deleted = false;

            for (int i = 0; i < sb.length() - 2; i++) {
                for (int j = i + 1; j < sb.length() - 1; j++) {
                    for (int k = j + 1; k < sb.length(); k++) {
                        if (sb.charAt(i) != sb.charAt(j) && sb.charAt(j) != sb.charAt(k)) {
                            sb.deleteCharAt(j);
                            deleted = true;
                            break;
                        }
                    }
                    if (deleted)
                        break;
                }
                if (deleted)
                    break;
            }

            if (!deleted)
                break;
        }

        return sb.length();
    }
}
