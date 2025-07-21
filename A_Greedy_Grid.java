import java.util.*;

public class A_Greedy_Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n> 1 && m>1) System.out.println("Yes");
            else System.out.println("No");

        }
    }
}
