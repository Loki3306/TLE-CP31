import java.util.*;

public class A_Grasshopper_on_a_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int k = sc.nextInt();
            solve(x, k);
        }
    }

    public static void solve(int x, int k) {
        if(x % k != 0) {
            System.out.println(1);
            System.out.println(x);
        }
        else{
            System.out.println(2);
            System.out.println((x%k + 1)+" "+(x-(x%k + 1)));
        }
    }
}
