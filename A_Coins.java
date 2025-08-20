import java.util.*;

public class A_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (canRepresent(n, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean canRepresent(long n, long k) {
        if (n % 2 == 0)
            return true;
        if (n >= k && (n - k) % 2 == 0)
            return true;
        return false;
    }

}
