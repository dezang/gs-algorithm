package inflean;

import java.util.Stack;

public class S05P01 {
    public String solution(String input) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = input.toCharArray();
        for(char c : charArray) {
            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
