import java.util.*;

public class B_Alternating_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    arr[i] = -1;
                } else {
                    arr[i] = 3;
                }
            }


            if (n % 2 == 0) { 
                arr[n - 1] = 2;
            }

            for (int i = 0; i < n; i++) {
                sb.append(arr[i]);
                if (i + 1 < n) sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
        sc.close();
    }
}
