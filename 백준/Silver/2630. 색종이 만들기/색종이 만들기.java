import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] map;
	static int blue, white = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		map = new int[n][n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		divide(0, 0, n);
		System.out.println(white);
		System.out.println(blue);
	}

	private static void divide(int x, int y, int n) {
		int chk = check(x, y, n);
		if(chk == 1) blue++;
		else if(chk == 0) white++;
		else {
			int n2 = n/2;
			
			divide(x, y, n2);
			divide(x, y+n2, n2);
			divide(x+n2, y, n2);
			divide(x+n2, y+n2, n2);
		}
	}

	private static int check(int x, int y, int n) {
		for(int i=x; i<x+n; i++) {
			for(int j=y; j<y+n; j++) {
				if(map[i][j] != map[x][y]) {
					return -1;
				}
			}
		}
		return map[x][y];
	}
}