import java.util.Scanner;

public class A_Desorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            solve(n, a); 
        }
        scanner.close();
    }

    private static void solve(int n, int[] a) {
        int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){

            if(a[i-1] > a[i] ){
                System.out.println(0);
                return;
            }

            minDiff= Math.min(minDiff,a[i]-a[i-1]);
        }

        System.out.println((minDiff)/2 +1);
    }
}
