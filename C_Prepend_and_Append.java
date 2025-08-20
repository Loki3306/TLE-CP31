
import java.util.*;
import java.io.*;

public class C_Prepend_and_Append {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            
            int result = solve(s, n);
            System.out.println(result);
        }
    }
    
   
    public static int solve(String s, int n) {
        int leftP=0;
        int rightP=s.length()-1;
        while(leftP<=rightP && s.charAt(leftP) != s.charAt(rightP) ){
            leftP++;
            rightP--;
        }
        return rightP-leftP+1; 
    }
}