import java.util.*;

public class A_United_We_Stand {

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        
        int index=0;
        int candidate=a[0];
        while(index < n){
            if(candidate == a[index]){
                b.add(candidate);
                index++;
            }
            else{
                break;
            }
        }


        for(int i=index;i<n;i++){
            c.add(a[i]);
        }

        if(b.size()==0 || c.size()==0){
            System.out.println(-1);
            return;
        }

        System.out.println(b.size() + " " + c.size());

        for(int i=0;i<b.size();i++){
            System.out.print(b.get(i) + " ");
        }
        System.out.println();

        for(int i=0;i<c.size();i++){
            System.out.print(c.get(i) + " ");
        }
        
        System.out.println();

        
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
