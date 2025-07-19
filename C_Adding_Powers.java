
import java.util.*;

public class C_Adding_Powers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            solve(n, k, a);
        }
    }

    public static void solve(int n, int k, long[] a) {
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (a[i] % k != 0 && a[i] != 0 && a[i] != 1) {
                flag = false;
                break;
            }
        }

        if (flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
    }
}