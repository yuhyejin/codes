import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int num;

        if(n > m) num = maxFactor(n, m);
        else num = maxFactor(m, n);


        System.out.println(num);
        System.out.println((n * m) / num);

    }

    public static int maxFactor(int n, int m) {
        if (m == 0)
            return n;
        else
            return maxFactor(m, n % m);
    }
}
