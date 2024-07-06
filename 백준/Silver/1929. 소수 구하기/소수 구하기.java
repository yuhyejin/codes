import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		boolean[] numArr = new boolean[n+1];
		numArr = check(numArr, n);
		
		for(int i=m; i<=n; i++) {
			if(!numArr[i])
				System.out.println(i);
		}
		
	}
	
	public static boolean[] check(boolean[] arr, int n) {
		arr[0]=arr[1]=true;
		
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(!arr[i]) {
				for(int j=i*i; j<=n; j+=i) {
					arr[j] = true;
				}
			}
		}
		return arr;
	}
}
