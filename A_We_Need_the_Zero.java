import java.util.*;
import java.io.*;

public class A_We_Need_the_Zero {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(input[i]);
            }
            
            int result = solve(a, n);
            System.out.println(result);
        }
    }
    
    // Implement your logic here
    public static int solve(int[] a, int n) {
        int xor_all=0;
        for(int i=0;i<n;i++){
            xor_all^=a[i];
        }

        if(xor_all==0) return 0;
        if(xor_all!=0 && n%2==0 ) return -1;

        

        
        
        return xor_all; // placeholder
    }
}