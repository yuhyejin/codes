import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // 산술평균
        double mean = (double) sum / n;
        System.out.println((int) Math.round(mean));

        // 중앙값
        Arrays.sort(arr);
        int median = arr[n / 2];
        System.out.println(median);

        // 최빈값
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // 최빈값 리스트로 정리
        int maxFreq = Collections.max(frequency.values());
        ArrayList<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modeList.add(entry.getKey());
            }
        }

        // 여러 개의 최빈값 중 두 번째로 작은 값 선택
        Collections.sort(modeList);
        int mode = modeList.size() > 1 ? modeList.get(1) : modeList.get(0);
        System.out.println(mode);

        // 범위
        int range = arr[n - 1] - arr[0];
        System.out.println(range);
    }
}