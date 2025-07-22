import java.util.*;

public class A_How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean exists = false;

            for (int i = 0; i < n; i++) {
                if (a[i] == k) {
                    exists = true;
                    break;
                }
            }

            if (exists) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
