package STACK.QUETIONS;
import java.util.*;
//1047
public class RemoveAllAdjacentDuplicatesInString {
    public  String Solution(String s){
        Stack<Character>stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if (!stack.isEmpty()&&stack.peek()==ch) {
                stack.pop();
            }stack.push(ch);
        }
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}
