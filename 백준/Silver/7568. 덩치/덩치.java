import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Info[] arrInfo = new Info[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arrInfo[i] = new Info(x, y);
		}
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arrInfo[i].getX() < arrInfo[j].getX() && arrInfo[i].getY() < arrInfo[j].getY()) {
					arr[i] += 1;
				}
			}
			arr[i] += 1;
		}
		
		for(int a : arr)
			System.out.print(a + " ");
		
	}
}

class Info {
	private int x;
	private int y;
	
	public Info() {
	}

	public Info(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Info [x=" + x + ", y=" + y + "]";
	}	
}