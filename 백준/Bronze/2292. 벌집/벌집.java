import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int range = 1;
        int cnt = 1;

        if(n == 1) {
            bw.write(String.valueOf(cnt));
        } else {
            while (range < n) {
                range += 6 * cnt;
                cnt++;
            }
            bw.write(String.valueOf(cnt));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}