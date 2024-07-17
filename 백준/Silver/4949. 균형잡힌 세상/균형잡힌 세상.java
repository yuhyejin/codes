import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while ((str = br.readLine()) != null && !str.equals(".")) {
        	Stack<Character> stack = new Stack<>();

            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == '(' || c == ')' || c == '[' || c == ']') {
                    if(!stack.empty() && stack.peek() == '(' && c == ')')
                        stack.pop();
                    else if (!stack.empty() && stack.peek() == '[' && c == ']')
                    	stack.pop();
                    else
                        stack.push(c);
                }
             }
            
            if(stack.empty())
              System.out.println("yes");
            else
              System.out.println("no");
        }
    }
}