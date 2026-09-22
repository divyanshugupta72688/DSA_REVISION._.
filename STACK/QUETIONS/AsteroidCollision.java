package STACK.QUETIONS;
import java.util.*;
//735
public class AsteroidCollision {
    public int[] Solution(int[]asteroids){
        Stack<Integer>stack = new Stack<>();
        for(int i  = 0;i<asteroids.length;i++){
            if (stack.isEmpty() || asteroids[i]>0) {
                stack.push(asteroids[i]);
            }else{
                while (!stack.isEmpty()) {
                    int top = stack.peek();
                    if (top<0) {
                        stack.push(asteroids[i]);
                        break;
                    }
                    int modval = Math.abs(asteroids[i]);
                    if (modval==top) {
                        stack.pop();
                        break;
                    }else if (top>modval) {
                        break;
                    }else{
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int[]ans = new int[stack.size()];
        for(int i = stack.size()-1;i>=0;i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}
