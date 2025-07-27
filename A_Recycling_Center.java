import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class A_Recycling_Center {

    static class Bag implements Comparable<Bag> {
        long originalWeight;
        int maxSafeK;

        public Bag(long originalWeight, int maxSafeK) {
            this.originalWeight = originalWeight;
            this.maxSafeK = maxSafeK;
        }

        @Override
        public int compareTo(Bag other) {
            if (this.maxSafeK != other.maxSafeK) {
                return Integer.compare(other.maxSafeK, this.maxSafeK);
            }
            return Long.compare(other.originalWeight, this.originalWeight);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long c = scanner.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            
            solve(n, c, a); 
        }
        scanner.close();
    }

    private static void solve(int n, long c, long[] a) {
        List<Bag> bags = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long currentWeight = a[i];
            int k = 0;
            int maxSafeK = -1;

            if (currentWeight > c) {
                maxSafeK = -1; 
            } else {
                while (true) {
                    if (currentWeight > c / 2) { 
                        maxSafeK = k; 
                        break;
                    }
                    currentWeight *= 2;
                    k++;

                    if (k >= n) { 
                        maxSafeK = n - 1; 
                        break;
                    }
                }
            }
            bags.add(new Bag(a[i], maxSafeK));
        }

        Collections.sort(bags);

        TreeSet<Integer> availableSteps = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            availableSteps.add(i);
        }

        int totalCost = 0;

        for (Bag bag : bags) {
            Integer assignedStep = availableSteps.floor(bag.maxSafeK);

            if (assignedStep != null) {
                availableSteps.remove(assignedStep);
            } else {
                totalCost++;
                availableSteps.pollFirst(); 
            }
        }
        
        System.out.println(totalCost);
    }
}
