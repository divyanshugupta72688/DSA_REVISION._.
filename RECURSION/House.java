package RECURSION;

public class House {
    public static int HouseRobber(int[]arr){
        int ans = solve(arr,0);
        return ans;
    }
    public static int solve(int[]arr,int index){
        if (index>=arr.length) {
            return 0;
        }
        int include = arr[index]+solve(arr, index+2);
        int exclude = solve(arr, index+1);
        return Math.max(include, exclude);
    }
}
