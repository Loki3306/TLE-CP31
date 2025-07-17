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

            // Build full path
            ArrayList<Integer> path = new ArrayList<>();
            path.add(0);
            Arrays.sort(a);
            for (int i = 0; i < n; i++)
                path.add(a[i]);
            path.add(x);
            for (int i = n - 1; i >= 0; i--)
                path.add(a[i]);
            path.add(0);

            // Set of refueling points
            HashSet<Integer> canRefuel = new HashSet<>();
            canRefuel.add(0);
            for (int val : a)
                canRefuel.add(val);

            int maxGap = 0;
            int lastRefuel = 0;

            for (int i = 1; i < path.size(); i++) {
                int current = path.get(i);
                int dist = Math.abs(current - path.get(i - 1));
                lastRefuel += dist;

                if (canRefuel.contains(current)) {
                    maxGap = Math.max(maxGap, lastRefuel);
                    lastRefuel = 0;
                }
            }

            // Edge case: if we never hit a refuel point at the end
            maxGap = Math.max(maxGap, lastRefuel);

            System.out.println(maxGap);
            sc.close();
        }
    }
}
