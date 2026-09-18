
package RECURSION;

import java.util.*;

public class Subsequence {

    public static List<String> SubsequenceOfString(String s) {
        ArrayList<String>ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        solve(s,0,ans,output);
        Collections.sort(ans);
        return ans;
    }
    public static void solve(String s,int index,ArrayList<String>ans, StringBuilder output){
        if (index>=s.length()) {
            ans.add(output.toString());
            return;
        }
        char ch = s.charAt(index);
        // include 
        output.append(ch);
        solve(s, index+1, ans, output);
        // exclude 
        output.deleteCharAt(output.length()-1);
        solve(s, index+1, ans, output);
    }
}
