import java.util.*;

public class A_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // size of the array
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if (canBeMadeGood(a)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }

    // Function to check if array can be permuted to become good
    static boolean canBeMadeGood(int[] a) {
        // TODO: implement logic
        return false; // placeholder
    }
}
