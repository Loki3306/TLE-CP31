




import java.util.Scanner;

public class  A_Adjacent_Digit_Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // Check if y = x + 1 (no carry case)
            if (y == x + 1) {
                System.out.println("YES");
                continue;
            }
            
            // Check if y = x - (9k - 1) for some k >= 1 (carry cases)
            boolean found = false;
            int k = 1;
            while (true) {
                int target = x - (9 * k - 1);
                if (target <= 0) {
                    break;
                }
                if (target == y) {
                    found = true;
                    break;
                }
                k++;
            }
            
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}