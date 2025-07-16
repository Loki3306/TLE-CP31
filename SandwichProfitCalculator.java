import java.util.*;

public class SandwichProfitCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int A = sc.nextInt(); 
int B = sc.nextInt(); 
int C = sc.nextInt(); 
System.out.println(calculateProfit(A, B, C));
}

public static int calculateProfit(int A, int B, int C) {
return A - (B + C);
}
}
