package 코드구현력기르기;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        String input = "()()(()())";

        Stack<String> stack = new Stack<>();

        if(input.charAt(0) == ')') {
            System.out.println("NO");
            return;
        }

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == '(') {
                stack.push("(");
            }else {
                stack.pop();
            }
        }


        if(stack.isEmpty()) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }



    }
}
