package RECURSION;

public class BinarySearch {
    public static int BinarySearch(int[]arr,int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = solve(arr,s,e,target);
        return ans;
    }
    public static int solve(int[]arr,int s,int e, int target){
        if (s>e) {
            return -1;
        }
        int mid = s+(e-s)/2;
        if (arr[mid]==target) {
            return mid;
        }
        else if(arr[mid]>target) {
            e = mid-1;
        }
        else{
            s = mid+1;
        }
     return   solve(arr, s, e, target);
    }
}
