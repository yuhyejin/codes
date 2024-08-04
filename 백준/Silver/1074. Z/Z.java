import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		z((int)Math.pow(2, N), r, c);
		
	}

	private static void z(int size, int r, int c) {
		if(size == 1) {
			System.out.println(cnt);
			return;
		}
		int n = size / 2;
		if(r < n && c < n) {
			cnt += n * n * 0;
			z(n, r, c);
		} else if(r < n && c < n + n) {
			cnt += n * n * 1;
			z(n, r, c-n);
		} else if(r < n + n && c < n) {
			cnt += n * n * 2;
			z(n, r-n, c);
		} else if(r < n + n && c < n + n) {
			cnt += n * n * 3;
			z(n, r-n, c-n);
		}	
	}
}