import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int num = 0;
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String queueStr = st.nextToken();
			if(queueStr.equals("push")) {
				num = Integer.parseInt(st.nextToken());
				queue.add(num);
			} else if(queueStr.equals("pop")) {
				if(queue.isEmpty())
					sb.append(-1 + "\n");
				else sb.append(queue.poll() + "\n");
			} else if(queueStr.equals("size")) {
				sb.append(queue.size() + "\n");
			} else if(queueStr.equals("empty")) {
				if(queue.isEmpty())
					sb.append(1 + "\n");
				else sb.append(0 + "\n");
			} else if(queueStr.equals("front")) {
				if(queue.isEmpty())
					sb.append(-1 + "\n");
				else sb.append(queue.peek() + "\n");
			} else if(queueStr.equals("back")) {
				if(queue.isEmpty())
					sb.append(-1 + "\n");
				else {
					// 큐의 가장 뒤에 있는 값을 출력하기 위해 LinkedList의 getLast() 메소드 활용
					int lastQueue = ((LinkedList<Integer>) queue).getLast();
					sb.append(lastQueue + "\n");
				}
			}
		}
		System.out.println(sb);
	}
}