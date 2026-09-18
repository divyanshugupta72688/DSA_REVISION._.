package RECURSION;

public class Climbing {
    public static int ClimbingStair(int n){
        if (n==0||n==1) {
            return 1;
        }
        return ClimbingStair(n-1)+ClimbingStair(n-2);
    }
}
