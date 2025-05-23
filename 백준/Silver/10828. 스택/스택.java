import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int num = 0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String stackStr = st.nextToken();
			if(stackStr.equals("push")) {
				num = Integer.parseInt(st.nextToken());
				stack.push(num);
			} else if(stackStr.equals("pop")) {
				if(stack.isEmpty())
					sb.append(-1 + "\n");
				else sb.append(stack.pop() + "\n");
			} else if(stackStr.equals("size")) {
				sb.append(stack.size() + "\n");
			} else if(stackStr.equals("empty")) {
				if(!stack.isEmpty())
					sb.append(0 + "\n");
				else sb.append(1 + "\n");
			} else if(stackStr.equals("top")) {
				if(stack.isEmpty())
					sb.append(-1 + "\n");
				else sb.append(stack.peek() + "\n");
			}
		}
		System.out.println(sb);
	}
}