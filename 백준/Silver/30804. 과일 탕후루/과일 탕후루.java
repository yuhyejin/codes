import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] fruits = new int[n];
        for (int i = 0; i < n; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }
        
        int left = 0;
        int count = 0;
        Map<Integer, Integer> fruitCount = new HashMap<>();
        
        for (int right = 0; right < n; right++) {
         	// 과일 종류가 있으면 +1, 없으면 추가
            fruitCount.put(fruits[right], fruitCount.getOrDefault(fruits[right], 0) + 1);
            
            while (fruitCount.size() > 2) {
                fruitCount.put(fruits[left], fruitCount.get(fruits[left]) - 1);
                if (fruitCount.get(fruits[left]) == 0) {
                    fruitCount.remove(fruits[left]);
                }
                left++;
            }
            
            count = Math.max(count, right - left + 1);
        }
        
        System.out.println(count);
    }
}