import java.util.*;

public class  A_Cover_in_Water{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            System.out.println(minActionsRequired(n, s));
        }

        sc.close();
    }

    public static int minActionsRequired(int n, String s) {
        int ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) =='.' && i+1<n && s.charAt(i+1) =='.' && i+2<n && s.charAt(i+2) =='.'){
                return 2;
            }

            if(s.charAt(i) =='.') ans++;
        }


        return ans;
    }
}
