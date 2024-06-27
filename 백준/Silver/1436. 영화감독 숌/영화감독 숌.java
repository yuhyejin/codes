import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 1;
		int ans = 666;
		
		while (n != count) {
			ans++;
			if(String.valueOf(ans).contains("666")) {
				count++;
			}
		}
		System.out.println(ans);
	}
}