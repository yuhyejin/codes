import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		
		int result = Integer.MAX_VALUE;	// 첫번째 값 확인용
		
		while(st.hasMoreTokens()) {
			int sum=0;
			
			StringTokenizer str = new StringTokenizer(st.nextToken(), "+");
			
			while(str.hasMoreTokens()) {
				sum += Integer.parseInt(str.nextToken());
			}
			
			if(result == Integer.MAX_VALUE)
				result = sum;	// 첫번째 값이면 먼저 더함 
			else
				result -= sum;	// 첫번째 값 아니면 빼기
		}
		System.out.println(result);
 	}
}