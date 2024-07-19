import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] nCard = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			nCard[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nCard);
		
		int m = Integer.parseInt(br.readLine());
		
		StringBuilder result = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int num = Integer.parseInt(st.nextToken());
			result.append(countBinarySearch(nCard, num)).append(" ");
		}
		System.out.println(result.toString());
		
	}
	
	public static int firstBinarySearch(int[] nCard, int num) {
		
		int start = 0;
		int end = nCard.length - 1;
		int result = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			//찾던 값과 같으면 왼쪽에도 같은 값이 있는지 다시 확인
			if(num == nCard[mid]) {
				result = mid;
				end = mid - 1;
			}
			else if(num > nCard[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return result;
	}
	
public static int lastBinarySearch(int[] nCard, int num) {
		
		int start = 0;
		int end = nCard.length - 1;
		int result = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			//찾던 값과 같으면 오른쪽에도 같은 값이 있는지 다시 확인
			if(num == nCard[mid]) {
				result = mid;
				start = mid + 1;
			}
			else if(num > nCard[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return result;
	}
	
	public static int countBinarySearch(int[] nCard, int num) {
		int first = firstBinarySearch(nCard, num);
		int last = lastBinarySearch(nCard, num);
		
		if (first == -1 || last == -1) {
            return 0;
        }
		
		return last - first + 1;
	}
}
