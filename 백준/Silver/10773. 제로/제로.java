import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int ans = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if(stack.empty() && n == 0)
                break;
            else if (!stack.empty() && n == 0)
                stack.pop();
            else  stack.push(n);
        }

        if(!stack.empty()) {
            for (int i = 0; i < stack.size(); i++) {
                ans += stack.get(i);
            }
            System.out.println(ans);
        }
        else {
            System.out.println(0);
        }
    }
}