import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		
		for(int i=0; i<m; i++) {
		if(binarySearch(arr, sc.nextInt())>=0)
			System.out.println(1);
		else 
			System.out.println(0);
		}
	}
	
	public static int binarySearch(int[] arr, int key) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			
			// 비교값이 중간값보다 작을 경우
			if(key < arr[mid])
				end = mid - 1;
			
			// 비교값이 중간값보다 클 경우
			else if(key > arr[mid])
				start = mid + 1;
			
			// 비교값이 중간값이랑 같을 경우
			else 
				return mid;
		}
		return -1;
		
	}
}
