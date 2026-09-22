package STACK.QUETIONS;
import  java.util.*;
//844
public class BackSpaceStringCompare {
    public  boolean Solution(String s,String t){
        Stack<Character>stack1 = new Stack<>();
        StringBuilder ans1 = new StringBuilder();
         Stack<Character>stack2 = new Stack<>();
        StringBuilder ans2 = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch=='#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }else{
                stack1.push(ch);
            }
        }
         for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            if (ch=='#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }else{
                stack2.push(ch);
            }
        }
       for(char ch : stack1){
        ans1.append(ch);
       }
       for(char ch : stack2){
        ans2.append(ch);
       }
       String solve1 = ans1.toString();
       String solve2 = ans2.toString();
       return solve1.equals(solve2);
    }
}
