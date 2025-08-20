import java.util.*;

public class A_Walking_Master {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            long result = minMoves(a, b, c, d);
            System.out.println(result);
        }
    }

    static long minMoves(long a, long b, long c, long d) {
        if(d < b) return -1;

        long diagonal_moves=(d-b);
        long curr_x=a+diagonal_moves;
        if(curr_x < c) return -1;            
        return (curr_x-c) + diagonal_moves;
    }
}
