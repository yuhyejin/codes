import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static boolean[] visited;
	static int[][] map;
	static int n, k;
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		
		map = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i=0; i<k; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			map[a][b] = map[b][a] = 1;
		}
		
		bfs(1);
		System.out.println(count);
	}

	private static void bfs(int first) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(first);
		visited[first] = true;
		
		while(!q.isEmpty()) {
			int idx = q.poll();
			for(int i=1; i<=n; i++) {
				if(map[idx][i] == 1 && !visited[i]) {
					visited[i] = true;
					count++;
					q.offer(i);
				}
			}
		}
		
	}
}
