package STACK.QUETIONS;

import java.util.*;

//1544
public class MakeTheStringGreate {
    public String Solution(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
