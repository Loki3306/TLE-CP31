import java.util.*;

public class A_Ambitious_Kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = minOperationsToMakeProductZero(arr);
        System.out.println(result);
    }

    public static int minOperationsToMakeProductZero(int[] arr) {
        int minOps = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num == 0)
                return 0;
            minOps = Math.min(minOps, Math.abs(num));
        }
        return minOps;
    }
}
