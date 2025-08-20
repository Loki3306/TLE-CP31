import java.util.*;

public class C_Make_it_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] S = new long[n];
            long[] T = new long[n];

            for (int i = 0; i < n; i++) S[i] = sc.nextLong();
            for (int i = 0; i < n; i++) T[i] = sc.nextLong();

            // TODO: Implement logic to check transformation possibility

            boolean possible = false; // placeholder

            sb.append(possible ? "YES\n" : "NO\n");
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
