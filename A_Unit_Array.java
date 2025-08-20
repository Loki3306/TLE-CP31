import java.util.*;

public class A_Unit_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = solve(a, n);
            System.out.println(ans);
        }
    }

    public static int solve(int[] a, int n) {
        
        int neg = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == -1) neg++;
        }
        
        int pos = n - neg;
        int operations = 0;
        
        
        
        while (neg % 2 == 1 || pos < neg) {

            neg--;
            pos++;
            operations++;
        }
        
        return operations;
    }
}