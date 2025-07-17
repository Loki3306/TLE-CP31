
import java.util.*;

public class A_Doremy_s_Paint_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // size of the array
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if (canBeMadeGood(a)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }

    // Function to check if array can be permuted to become good
    static boolean canBeMadeGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 2)
            return true;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if (map.size() > 2)
            return false;
        if (map.size() == 1)
            return true;

        if (Math.abs(map.get(nums[0]) - map.get(nums[n - 1])) == 1)
            return true;
        if (map.get(nums[0]) - map.get(nums[n - 1]) == 0)
            return true;

        return false;
    }
}
