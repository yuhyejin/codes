import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] size = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());        
        int p = Integer.parseInt(st.nextToken());
        
        // size 배열의 각 값을 t로 나눈 몫을 출력
        int sum = 0;
        for (int i : size) {
        	if(i%t > 0)
        		sum += (i/t) + 1;
        	else sum += i/t;
        }

        System.out.println(sum);
        
        // n을 p로 나눈 몫과 나머지를 출력
        System.out.print(n / p + " ");
        System.out.print(n % p);
	}
}