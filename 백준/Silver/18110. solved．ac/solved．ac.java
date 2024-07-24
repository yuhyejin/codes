import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> level = new ArrayList<>();
        if(n == 0) {
            System.out.println(0);
        } else {
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                level.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(level);

            int delete = Math.round((float) (n * 15) /100);


            List<Integer> subList = level.subList(delete, level.size()-delete);

            int ans = 0;
            for (int i = 0; i < subList.size(); i++) {
                ans += subList.get(i);
            }
            System.out.println(Math.round((float) ans / subList.size()));
        }
    }
}