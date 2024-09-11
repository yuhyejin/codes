import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x == 0) {
				if(queue.isEmpty()) {
					sb.append(0 + "\n");
					continue;
				}
				else {
					sb.append(queue.poll() + "\n");
					continue;
				}
				
			}
			queue.add(x);
		}
		System.out.println(sb);
	}
}