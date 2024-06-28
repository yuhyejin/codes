import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double avg = 0;
		double max = 0;
		double[] num = new double[N];
		
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
			if(max<=num[i]) {
				max = num[i];
			}
		}
		for(int i=0; i<N; i++) {
			num[i] = num[i]/max*100;
			avg += num[i];
		}
		System.out.println(avg/N);
		
	}
}