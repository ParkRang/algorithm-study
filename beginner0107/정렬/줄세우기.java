import java.util.Scanner;

public class 줄세우기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        while (P -- > 0) {
            int T = sc.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++) {
                h[i] = sc.nextInt();
            }
            int cnt = 0;
            int[] sorted = new int[20];

            for (int i = 0; i < 20; i ++) {
                boolean isFind = false;
                for (int j = 0; j < i; j ++) {
                    if (sorted[j] > h[i]) {
                        isFind = true;
                        for (int k = i - 1; k >= j; k --) {
                            sorted[k + 1] = sorted[k];
                            cnt++;
                        }
                        sorted[j] = h[i];
                        break;
                    }
                }
                if (!isFind) {
                    sorted[i] = h[i];
                }
            }

            System.out.println(T + " " + cnt);
        }
    }
}
