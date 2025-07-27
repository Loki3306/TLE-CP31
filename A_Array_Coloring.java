import java.util.Scanner;

public class A_Array_Coloring {

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
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=a[i];
    }

    if(sum %2==0){
        System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
