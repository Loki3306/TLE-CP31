import java.util.Scanner;

public class B_Hamiiid_Haaamid_Hamid {

    private static long cost(long w, long e) {
        if (w == 0) return 0;
        return w + Math.min(w, e);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int pos = sc.nextInt() - 1;
            String s = sc.next();

            long wl = 0, el = 0;
            for (int i = 0; i < pos; i++) {
                if (s.charAt(i) == '#') wl++;
                else el++;
            }

            long wr = 0, er = 0;
            for (int i = pos + 1; i < n; i++) {
                if (s.charAt(i) == '#') wr++;
                else er++;
            }

            long left = -1;
            if (el > 0) {
                long a = cost(wl + 1, el - 1);
                long b = cost(wr, er);
                left = Math.min(a, b);
            }

            long right = -1;
            if (er > 0) {
                long a = cost(wl, el);
                long b = cost(wr + 1, er - 1);
                right = Math.min(a, b);
            }

            long res;
            if (left == -1) res = right;
            else if (right == -1) res = left;
            else res = Math.max(left, right);

            System.out.println(1 + res);
        }
        sc.close();
    }
}
