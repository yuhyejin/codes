import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			Queue<Integer> queue = new LinkedList<>();
			Queue<Integer> idxQueue = new LinkedList<>();
			
			for(int j=0; j<n; j++) {
				queue.add(sc.nextInt());
				idxQueue.add(j);
			}
			
			int count = 0;
			
			while(!queue.isEmpty()) {
				int priority = queue.poll(); // 큐에서 첫 번째 문서의 중요도를 가져옴
                int index = idxQueue.poll(); // 큐에서 첫 번째 문서의 인덱스를 가져옴
                boolean isPriority = false; // 현재 문서보다 높은 중요도의 문서가 있는지 여부를 저장할 변수

                // 큐에 남아있는 문서들 중 현재 문서보다 중요도가 높은 문서가 있는지 확인
                for (int num : queue) {
                    if (num > priority) {
                    	isPriority = true;
                        break; // 높은 중요도의 문서를 찾으면 반복문을 종료
                    }
                }

                if (isPriority) {
                    queue.add(priority); // 현재 문서를 큐의 끝에 다시 추가
                    idxQueue.add(index); // 현재 문서의 인덱스를 큐의 끝에 다시 추가
                } else {
                	count++;
                    if (index == m) {
                        System.out.println(count); 
                        break; 
                    }
                }
			}
		}
		
	}

}
