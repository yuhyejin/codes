import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(br.readLine()));
        }

        Integer[] arr = new Integer[set.size()];
        set.toArray(arr);
        Arrays.sort(arr);

        for (int i = 0; i < set.size(); i++) {
            sb.append(arr[i] + "\n");
        }

        System.out.println(sb);
    }
}
