
// import java.util.*;

// public class  A_Line_Trip{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int t = sc.nextInt();  // number of test cases
        
//         while (t-- > 0) {
//             int n = sc.nextInt();  // number of gas stations
//             int x = sc.nextInt();  // destination point
            
//             int[] stations = new int[n];
//             for (int i = 0; i < n; i++) {
//                 stations[i] = sc.nextInt();  // station locations
//             }

//             int result = minimumTankCapacity(n, x, stations);
//             System.out.println(result);
//         }
//     }

//     public static int minimumTankCapacity(int n, int x, int[] nums) {
//         if(n==1){
//             if(nums[0] >= (2*(x-nums[0]))) return nums[0];
//             else return (2*(x-nums[0]));
//         }





//         int maxD=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length-1;i++){
//             int d=nums[i+1]-nums[i];
//             maxD=Math.max(maxD,d);
//         }

//         int d=(x-nums[n-1])*2;
//         maxD=Math.max(maxD,d);

//         return maxD;
//     }
// }

import java.util.*;

public class A_Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();  // number of gas stations
            int x = sc.nextInt();  // destination point
            
            int[] stations = new int[n];
            for (int i = 0; i < n; i++) {
                stations[i] = sc.nextInt();  // station locations
            }

            int result = minimumTankCapacity(n, x, stations);
            System.out.println(result);
        }
    }

    public static int minimumTankCapacity(int n, int x, int[] nums) {
        int maxGap = 0;

        // Gap from 0 to first station
        maxGap = Math.max(maxGap, nums[0] - 0);

        // Gaps between stations
        for (int i = 0; i < n - 1; i++) {
            maxGap = Math.max(maxGap, nums[i + 1] - nums[i]);
        }

        // Last segment: from last station to x and back
        maxGap = Math.max(maxGap, (x - nums[n - 1]) * 2);

        return maxGap;
    }
}
