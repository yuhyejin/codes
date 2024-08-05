import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visit;
    static int[][] map;
    static int n, m, v;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        map = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }

        dfs(v);
        sb.append("\n");
        visit = new boolean[n + 1];
        bfs(v);

        System.out.println(sb);
    }

    private static void dfs(int v) {
        visit[v] = true;
        sb.append(v + " ");

        for(int i=1; i<=n; i++) {
            if(map[v][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visit[v] = true;

        while(!q.isEmpty()) {
            int idx = q.poll();
            sb.append(idx + " ");
            for(int i=1; i<=n; i++) {
                if(map[idx][i] == 1 && !visit[i]) {
                    visit[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}