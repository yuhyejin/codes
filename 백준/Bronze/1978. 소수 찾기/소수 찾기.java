import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ans=0;
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean[] numArr = new boolean[1001];
		numArr = check(numArr);
		
		for(int i=0; i<arr.length; i++) {
			if(!numArr[arr[i]]) {
				ans++;
			}
		}
		System.out.println(ans);
		
	}
	
	public static boolean[] check(boolean[] numArr) {
		numArr[0] = numArr[1] = true;
		
		for(int i=2; i<=Math.sqrt(numArr.length); i++) {
			if(!numArr[i]) {
				for(int j=i*i; j<numArr.length; j+=i) {
					numArr[j] = true;
				}
			}
		}
		return numArr;
	}
}
