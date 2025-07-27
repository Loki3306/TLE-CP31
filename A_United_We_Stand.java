import java.util.*;

public class A_United_We_Stand {

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                b.add(a[i]);
            } else {
                c.add(a[i]);
            }
        }

        if(b.size() ==0){
            b.add(c.get(0));
            c.remove(c.get(0));
        }
        if(c.size() == 0){
            c.add(b.get(0));
            b.remove(b.get(0));
        }

        Collections.sort(b);
        Collections.sort(c);

        if(b.get(0) == c.get(0)){
          System.out.println(-1);  
        } 

        else {

            for(int i=0;i<b.size();i++){
                System.out.print(b.get(i) + " ");
            }
            System.out.println();
            for(int i=0;i<c.size();i++){
                System.out.print(c.get(i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }
}
