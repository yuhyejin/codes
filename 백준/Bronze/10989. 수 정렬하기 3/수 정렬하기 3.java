import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		
		for(int a : num)
			sb.append(a + "\n");
		
		System.out.println(sb);
	}
}