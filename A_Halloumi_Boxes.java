

import java.util.*;

public class  A_Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();  // number of boxes
            int k = sc.nextInt();  // max reverse length
            int[] boxes = new int[n];
            
            for (int i = 0; i < n; i++) {
                boxes[i] = sc.nextInt();  // values on boxes
            }

            boolean canSort = canBeSorted(n, k, boxes);
            System.out.println(canSort ? "YES" : "NO");
        }
    }

    public static boolean canBeSorted(int n, int k, int[] boxes) {

        if(k == 1 &&  isSorted(boxes)) return true;
        if(k >1) return true;


        return false;
    }

    public static boolean isSorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]) return false;
        }
        return true;
    }
}
