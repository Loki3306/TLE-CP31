import java.util.*;

public class B_Blank_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int result=0;
            int count=0;
            for(int i=0;i<n;i++){
                if(a[i]==0){
                    count++;
                }
                else{
                    result=Math.max(result,count);
                    count=0;
                }
            }
            result=Math.max(result,count);

            System.out.println(result);
        }
    }
}
