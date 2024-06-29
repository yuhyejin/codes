import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] num = new int[k];
		
		for(int i=0; i<k; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		
		long start = 1;
		long end = num[k-1];
		long mid, count;
		
		while(start<=end) {
			count = 0;
			mid = (start + end)/2;
			
			for(int i=0; i<k; i++) {
				count += num[i]/mid;
			}
			if(count<n) end = mid - 1;
			else start = mid + 1;
		}
		System.out.println(end);
	}
}