import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static Queue<Node> queue = new LinkedList<>();
    static int[][] map;
    static boolean[][] isVisit;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { -1, 0, 1, 0 };
    static int nx, ny;
    static int t, m, n, k;
    static int count;

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            map = new int[m][n];
            isVisit = new boolean[m][n];

            for(int j=0; j<k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            count = 0;

            for(int j=0; j<m; j++) {
                for(int y=0; y<n; y++) {
                    if(!isVisit[j][y] && map[j][y] == 1) {
                        count++;
                        bfs(j, y);
                    }
                }
            }
            System.out.println(count);
        }


    }

    private static void bfs(int x, int y) {
        queue.add(new Node(x, y));
        isVisit[x][y] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for(int i=0; i<4; i++) {
                nx = node.x + dx[i];
                ny = node.y + dy[i];

                if(rangeCheck() && !isVisit[nx][ny] && map[nx][ny] == 1) {
                    queue.add(new Node(nx, ny));
                    isVisit[nx][ny] = true;
                }
            }
        }
    }

    private static boolean rangeCheck() {
        return nx >= 0 && nx < m && ny >= 0 && ny < n;
    }
}