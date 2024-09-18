import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static boolean[][] visited;
	static int[][] map;
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {-1, 0, 1, 0};
	static int n, nx, ny;
	static ArrayList<Integer> answer = new ArrayList<>();
	
	static class Node {
		int x;
		int y;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		visited = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<n; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j] && map[i][j] == 1) {
					bfs(i, j);
				}
			}
		}
		
		Collections.sort(answer);
		System.out.println(answer.size());
		
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}

	private static void bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(x, y));
		visited[x][y] = true;
		int sum = 1;
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			
			for(int i=0; i<4; i++) {
				nx = node.x + dx[i];
				ny = node.y + dy[i];
				
				if(rangeCheck() && !visited[nx][ny] && map[nx][ny] == 1) {
					q.add(new Node(nx, ny));
					visited[nx][ny] = true;
					sum++;
				}
			}
		}
		answer.add(sum);
	}

	private static boolean rangeCheck() {
		return nx >= 0 && nx < n && ny >= 0 && ny < n;
	}
}