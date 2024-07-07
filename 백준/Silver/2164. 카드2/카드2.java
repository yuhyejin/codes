import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		boolean isRemove = true;
		while(queue.size() != 1) {
			int topNum = queue.poll();
			
			if(!isRemove) {
				queue.add(topNum);
				isRemove = true;
			}
			else isRemove = false;
		}
		System.out.println(queue.peek());
	}
}
