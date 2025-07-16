import java.util.*;

public class A_Jagged_Swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // size of the permutation
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if (canBeSorted(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    // Function to determine if the permutation can be sorted using the given swap rules
    static boolean canBeSorted(int[] nums) {
        int n = nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
        }

        if(min != nums[0]) return false;
        

        return true; // default return, change accordingly
    }
}
