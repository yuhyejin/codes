import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[k+1][n+1];

            for (int j = 1; j <=n; j++) {
                arr[0][j] = j;
            }

            for (int j = 1; j <= k; j++) {
            	for (int p = 1; p <= n; p++) {
            		if(p == 1)
            			arr[j][p] = 1;
            		else {
            			arr[j][p] = arr[j-1][p] + arr[j][p-1]; 
            		}
            	}
            }
            System.out.println(arr[k][n]);
        }
    }
}