import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			String n = sc.nextLine();
			if(n.equals("0")) return;
			
			int start = 0;
			int end = n.length()-1;
			
			String ans = "yes";
			
			while(start <= end) {
				if(n.charAt(start) != n.charAt(end)) {
					ans = "no";
					break;
				}
				start++;
				end--;
			}
			System.out.println(ans);
		}
		
	}

}