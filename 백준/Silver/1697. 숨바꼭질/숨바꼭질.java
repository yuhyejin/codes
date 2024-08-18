import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N, K;
	static int[] visited = new int[100001];
	
	public static void main(String[] ags) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		System.out.println(bfs(N));
		
	}

	private static int bfs(int n) {
		Queue<Integer> q = new LinkedList<>();
		q.add(n);
		visited[n] = 1;
		
		while(!q.isEmpty()) {
			int idx = q.poll();
			
			if(idx == K)
				return visited[idx] - 1;
			if(idx-1 >= 0 && visited[idx-1] == 0) {
				visited[idx-1] = visited[idx] + 1;
				q.add(idx-1);
			}
			if(idx+1 <= 100000 && visited[idx+1] == 0) {
				visited[idx+1] = visited[idx] + 1;
				q.add(idx+1);
			}
			if(2*idx <= 100000 && visited[2*idx] == 0) {
				visited[2*idx] = visited[idx] + 1;
				q.add(2*idx);
			}
		}
		return -1;
	}
}