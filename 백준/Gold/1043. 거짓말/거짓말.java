import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M;
	static boolean[] visited;			// 진실을 아는 사람 방문여부 
	static Queue<Integer> trueFirst;	// 진실을 아는 사람 번호
	static Party[] party;				// 파티 정보 
	static LinkedList<Integer>[] nodes;	// 같은 파티에 있는 사람 연결 
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		trueFirst = new LinkedList();
		party = new Party[M];
		nodes = new LinkedList[N + 1];
		
		// 초기화 
		for(int i=1; i<=N; i++) {
			nodes[i] = new LinkedList();
		}
		
		// 진실을 아는 사람 입력
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		for(int i=0; i<k; i++) {
			int n = Integer.parseInt(st.nextToken());
			trueFirst.add(n);
		}
		
		// 파티 참석자 입력
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] people = new int[n];
			
			int pre = 0;
			for(int j = 0; j < n; j++) {
			    int personNum = Integer.parseInt(st.nextToken());
			    people[j] = personNum;

			    // 같은 파티 사람 연결
			    if(pre != 0) {
			        nodes[pre].add(personNum);
			        nodes[personNum].add(pre);
			    }
			    pre = personNum;
			}
			
			// 파티정보를 Part 객체로 저장
			Party newParty = new Party(n, people);
			party[i] = newParty;
		}
		
		visited = new boolean[N + 1];
		while(!trueFirst.isEmpty()) {
			bfs(trueFirst.poll());
		}
		
		// 거짓말할 수 있는 파티 수
		int total = M;
		for(int i=0; i<M; i++) {
			Party party1 = party[i];
			boolean flag = false;
			for(int j=0; j<party1.n; j++) {
				int n = party1.people[j];
				if(visited[n]) {
					flag = true;
					break;
				}
			}
			if(flag) total--;
		}
		System.out.println(total);
	}
	
	private static class Party {
		int n;
		int[] people;
		
		public Party(int n, int[] people) {
			this.n = n;
			this.people = people;
		}
	}
	
	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList();
		visited[start] = true;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			int n = queue.poll();
			LinkedList<Integer> list = nodes[n];
			for(int i : list) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}