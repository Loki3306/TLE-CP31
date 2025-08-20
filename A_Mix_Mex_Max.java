import java.util.*;

public class A_Mix_Mex_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if (solve(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean solve(int[] a) {
        int n = a.length;
        int[] arr = a.clone();

        // Try to fill the array using backtracking
        return backtrack(arr, 0);
    }

    public static boolean backtrack(int[] arr, int pos) {
        int n = arr.length;

        if (pos == n) {
            // Check all triplets
            for (int i = 0; i <= n - 3; i++) {
                if (!isValidTriplet(arr[i], arr[i + 1], arr[i + 2])) {
                    return false;
                }
            }
            return true;
        }

        if (arr[pos] != -1) {
            return backtrack(arr, pos + 1);
        }

        // Try values 0, 1, 2 (based on analysis of valid patterns)
        for (int val = 0; val <= 2; val++) {
            arr[pos] = val;

            // Early pruning: check if any completed triplet is invalid
            boolean validSoFar = true;
            for (int i = Math.max(0, pos - 2); i <= pos - 2 && i <= n - 3; i++) {
                if (i + 2 == pos) { // This triplet is now complete
                    if (!isValidTriplet(arr[i], arr[i + 1], arr[i + 2])) {
                        validSoFar = false;
                        break;
                    }
                }
            }

            if (validSoFar && backtrack(arr, pos + 1)) {
                return true;
            }
        }

        arr[pos] = -1; // backtrack
        return false;
    }

    public static boolean isValidTriplet(int a, int b, int c) {
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);

        int mex = findMex(set);
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        return mex == max - min;
    }

    public static int findMex(Set<Integer> set) {
        for (int i = 0;; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
    }
}