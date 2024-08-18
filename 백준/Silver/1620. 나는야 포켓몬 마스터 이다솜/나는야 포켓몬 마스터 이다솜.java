import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, String> pokeMap1 = new HashMap<>();
		HashMap<String, Integer> pokeMap2 = new HashMap<>();
		
		for(int i=1; i<=n; i++) {
			String pokemon = br.readLine();
			pokeMap1.put(i, pokemon);
			pokeMap2.put(pokemon, i);
		}
		
		for(int i=0; i<m; i++) {
			String str = br.readLine();
			
			if(Character.isDigit(str.charAt(0)))
				System.out.println(pokeMap1.get(Integer.parseInt(str)));
			else
				System.out.println(pokeMap2.get(str));
		}	
	}
}
