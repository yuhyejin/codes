import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int current = arr[i];

            while (num <= current) {
                stack.push(num);
                num++;
                sb.append("+\n");
            }

            if (stack.peek() == current) {
                stack.pop();
                sb.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.print(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}