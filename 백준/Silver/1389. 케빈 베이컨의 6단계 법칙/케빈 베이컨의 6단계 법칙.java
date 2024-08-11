import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] map;
	static int n, m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n + 1][n + 1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			map[a][b] = map[b][a] = 1;
		}
		
		int minBacon = Integer.MAX_VALUE; // 최소 케빈 베이컨 수
		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			int bacon = bfs(i);
			
			if(bacon < minBacon) { // 가장 작은 케빈 베이컨 수를 가진 사람 찾기
				minBacon = bacon;
				result = i;
			}
		}
		
		System.out.println(result);
	}

	private static int bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		int[] dist = new int[n + 1]; // 거리 저장 배열
		boolean[] visited = new boolean[n + 1];
		
		queue.add(start);
		visited[start] = true;
		
		int sum = 0;
		
		while(!queue.isEmpty()) {
			int idx = queue.poll();
			
			for(int i = 1; i <= n; i++) {
				if(map[idx][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
					dist[i] = dist[idx] + 1; // 현재 노드까지의 거리 계산
					sum += dist[i]; // 케빈 베이컨 수 합산
				}
			}
		}
		return sum;
	}
}