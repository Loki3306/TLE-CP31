import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = fs.nextInt();
        while (t-- > 0) {
            solve(fs, out);
        }
        out.close();
    }

    private static void solve(FastScanner fs, PrintWriter out) {
        int n = fs.nextInt();
        int k = fs.nextInt();
        int x = fs.nextInt();

        // Case 1: If 1 is not the forbidden integer (x != 1), we can always use 'n' ones.
        // This is the simplest and always valid solution if 1 is available.
        if (x != 1) {
            out.println("YES");
            out.println(n); // Total count of integers is n
            for (int i = 0; i < n; i++) {
                out.print("1 "); // Print 'n' times the integer 1
            }
            out.println(); // New line after printing all integers
        } else { // Case 2: If 1 is the forbidden integer (x == 1)
            // Subcase 2.1: If k is 1 and x is 1, then no integers are available (only 1 was available, but it's forbidden).
            if (k == 1) {
                out.println("NO"); // Impossible to form any sum
            } else { // Subcase 2.2: If k >= 2 and x is 1 (1 is forbidden, but 2, 3, ..., k are available)
                // If n is even, we can use only '2's to form the sum.
                // Since k >= 2 and x == 1, '2' is always an available and allowed integer.
                if (n % 2 == 0) {
                    out.println("YES");
                    out.println(n / 2); // Total count of integers is n/2
                    for (int i = 0; i < n / 2; i++) {
                        out.print("2 "); // Print 'n/2' times the integer 2
                    }
                    out.println(); // New line after printing all integers
                } else { // If n is odd
                    // If n is odd, we cannot form it using only '2's.
                    // We need at least one odd number. The smallest odd number available (if k >= 3) is '3'.
                    // If '3' is available (k >= 3), we can use one '3' and form the remaining (n-3) with '2's.
                    // This is possible if n >= 3, as (n-3) will be an even non-negative number.
                    if (k >= 3) {
                        if (n >= 3) { // Ensure n is large enough to subtract 3
                            out.println("YES");
                            int numTwos = (n - 3) / 2; // Calculate how many '2's are needed for (n-3)
                            out.println(numTwos + 1); // Total count: numTwos + one '3'
                            for (int i = 0; i < numTwos; i++) {
                                out.print("2 "); // Print the '2's
                            }
                            out.print("3 "); // Print the '3'
                            out.println(); // New line after printing all integers
                        } else { // If n is 1 (and x=1, k>=2), it's impossible to form with 2s or 3s.
                            out.println("NO");
                        }
                    } else { // If k == 2 and x == 1, only '2' is available. Cannot form an odd 'n'.
                        out.println("NO");
                    }
                }
            }
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
