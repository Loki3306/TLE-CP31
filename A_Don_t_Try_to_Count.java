import java.util.*;

public class A_Don_t_Try_to_Count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            int operations=0;
            String str=x;
            
            while(str.length() <= 25 ){
                if(str.contains(s)){
                    break;
                }

                operations++;
                str = str + str;
            }

            if(str.contains(s)){
                System.out.println(operations);
            }
            else{
                System.out.println(-1);
            }

        }
    }
}
