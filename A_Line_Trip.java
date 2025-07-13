import java.util.*;

public class A_Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            ArrayList<Integer> path = new ArrayList<>();
            path.add(0);
            for (int i = 0; i < n; i++) {
                path.add(a[i]);
            }
            path.add(x);
            for (int i = n - 1; i >= 0; i--) {
                path.add(a[i]);
            }
            path.add(0);
            int maxGap = 0;
            for (int i = 1; i < path.size(); i++) {
                int gap = Math.abs(path.get(i) - path.get(i - 1));
                if (gap > maxGap) {
                    maxGap = gap;
                }
            }
            System.out.println(maxGap);
        }
    }
}
