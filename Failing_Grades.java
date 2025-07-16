import java.util.*;

public class Failing_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            checkScholarship(A);
        }
    }

    public static void checkScholarship(int[] A) {
        boolean isAbove=true;
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            if(sum / (i+1) < 40) {
                isAbove=false; 
                break;
            }
        }

        if(isAbove == true) System.out.println("yes");
        else System.out.println("no");
    }
}
