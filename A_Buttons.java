import java.util.Scanner;

public class A_Buttons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            
            determineWinner(a, b, c); 
        }
        scanner.close();
    }

    private static void determineWinner(long a, long b, long c) {
        long annaTotalTurns = a + (c + 1) / 2;

        long katieTotalTurns = b + c / 2;

        if (annaTotalTurns > katieTotalTurns) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
