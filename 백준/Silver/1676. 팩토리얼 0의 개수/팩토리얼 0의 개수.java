import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		BigInteger big = new BigInteger("1");
		int count = 0;
		
		for(int i=1; i<=n; i++) {
			big = big.multiply(BigInteger.valueOf(i));
		}
		
		String s = String.valueOf(big);
		
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)-'0' == 0) {
				count++;
			}
            else break;
		}
		System.out.println(count);
	}
}
