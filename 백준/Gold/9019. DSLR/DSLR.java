import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int T, A, B;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			sb.append(bfs(A, B)).append("\n");
		}
		System.out.println(sb);
	}

	static String bfs(int a, int b) {
		Queue<Integer> q = new LinkedList<>();
		q.add(a);
		String command[] = new String[10000];
		command[a] = "";
        //dslr은 현재 처리 중인 숫자
		int dslr, d, s, l, r;
		while(!q.isEmpty() && command[b] == null) {
			dslr = q.remove();
			d = (dslr * 2) % 10000;
			if(command[d] == null) {
				command[d] = command[dslr] + "D";
				q.add(d);
			}
			s = dslr == 0 ? 9999 : dslr - 1;
            if (command[s] == null) {
                command[s] = command[dslr] + "S";
                q.add(s);
            }
            l = dslr % 1000 * 10 + dslr / 1000;
            if (command[l] == null) {
                command[l] = command[dslr] + "L";
                q.add(l);
            }
            r = dslr % 10 * 1000 + dslr / 10;
            if (command[r] == null) {
                command[r] = command[dslr] + "R";
                q.add(r);
            }
        }
        return command[b];
	}
}