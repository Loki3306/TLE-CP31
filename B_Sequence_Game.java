import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class B_Sequence_Game {

    // Your solution logic for each test case
    // Now accepts a Scanner object
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        List<Integer> a = new ArrayList<>();
        a.add(b[0]); 

        for(int i = 1; i < n; i++){
            
            if(b[i] >= b[i-1]) {
                a.add(b[i]);
            } else {
                a.add(b[i]);
                a.add(b[i]); 
            }
        }

        // Print the result
        System.out.println(a.size());
        for(int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner once
        int t = scanner.nextInt(); // Read the number of test cases
        while (t-- > 0) {
            solve(scanner); // Pass the same Scanner object to solve()
        }
        scanner.close(); // Close the scanner at the end
    }
}
