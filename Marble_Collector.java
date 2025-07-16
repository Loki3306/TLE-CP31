import java.util.*;

public class Marble_Collector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            countMissingTypes(A, M);
        }
    }

    public static void countMissingTypes(int[] A, int M) {
        int N=A.length;
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            set.add(A[i]);
        }

        for(int i=1;i<=M;i++){
            if(! set.contains(i)){
                 list.add(i);
            }
        }
        
        System.out.println(list.size());
    }
}
