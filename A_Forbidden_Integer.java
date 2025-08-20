import java.util.*;

public class A_Forbidden_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            solve(n, k, x);
        }
    }

    public static void solve(int n, int k, int x) {
        if (!ifPossible(n, k, x)) {
            System.out.println("NO");
            return;
        }

        List<Integer> ans = buildAnswer(n, k, x);
        System.out.println("YES");
        System.out.println(ans.size());
        for (int v : ans) System.out.print(v + " ");
        System.out.println();
    }

    // Logic-only check
    public static boolean ifPossible(int n, int k, int x) {
        if (k == 1 && x == 1) return false;
        if (x != 1) return true;
        if (k == 1) return false;
        if (k == 2) return n % 2 == 0;
        return n != 1;  // k >= 3, x == 1
    }

    // Construct the sequence
    public static List<Integer> buildAnswer(int n, int k, int x) {
        List<Integer> result = new ArrayList<>();

        if (x != 1) {
            for (int i = 0; i < n; i++) result.add(1);
        } 
        else {
            if (k == 1) return result; // impossible, should not be called
            if (k == 2) {
                for (int i = 0; i < n / 2; i++) result.add(2);
            } 
            else { // k >= 3, x == 1
                if (n % 2 == 0) {
                    for (int i = 0; i < n / 2; i++) result.add(2);
                } 
                else {
                    for (int i = 0; i < (n - 3) / 2; i++) result.add(2);
                    result.add(3);
                }
            }
        }

        return result;
    }
}
