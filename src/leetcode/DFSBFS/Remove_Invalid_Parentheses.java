package leetcode.DFSBFS;

import java.util.*;

public class Remove_Invalid_Parentheses {
    public static void main(String[] args) {
        String s = ")(";
       List<String> res = removeInvalidParentheses(s);
       if(res.size() == 0){
           res.add(" ");
       }
        System.out.println(res.toString());
    }

    private static List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        if(s==null) {
            return res;
        }

        for(int i=0; i<s.length(); i++) {
            String newStr = s.substring(0,i) + s.substring(i+1);
            if(isValid(newStr) && !visited.contains(newStr)) {
                visited.add(newStr);
                res.add(newStr);
            }
        }
        return res;
    }
    private static boolean isValid(String newStr) {
        int count =0;  // ) (  ()
        for(char str : newStr.toCharArray()) {
            if(str=='(') {
                count++;
            }else if(str ==')') {
                count--;
                if(count < 0) {
                    return false;
                }
            }
        }
        return count ==0;
    }
}
