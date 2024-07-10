import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            String a = String.valueOf(i);
            for (int j = 0; j < a.length(); j++) {
                num += a.charAt(j) - '0';
            }
            if (num == n) {
                ans = i;
                break; 
            }
        }
        System.out.println(ans);
    }
}