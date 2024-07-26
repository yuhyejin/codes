import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        // 큰 봉지부터
        while (n >= 0) {
            if (n % 5 == 0) {
                cnt += n / 5;
                System.out.println(cnt);
                return;
            }

            // 5로 나누어 떨어지지 않으면 3kg짜리 사용하고 cnt 증가
            n -= 3;
            cnt++;
        }
        System.out.println(-1);
    }
}