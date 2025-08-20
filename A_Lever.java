import java.util.Scanner;

class A_Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();

            // TODO: Implement the logic to calculate the answer
            int ans=1;
            for(int i=0;i<n;i++){
                if(a[i] - b[i] > 0){
                    ans+=a[i] - b[i]; 
                }
            }


            sb.append(ans).append('\n');
        }
        System.out.print(sb.toString());
        sc.close();
    }
}
