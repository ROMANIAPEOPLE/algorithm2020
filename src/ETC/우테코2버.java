package ETC;

import java.util.Arrays;

public class 우테코2버 {
    public static void main(String[] args) {
        String s = "987987";
        String op ="-";

        System.out.println(Arrays.toString(solution(s,op)));
    }

    public static long[] solution(String s, String op){

        int len = s.length();

        long [] answer = new long[len-1];

        for(int i=0; i<len-1; i++){
            String str1 = s.substring(0,i+1);
            String str2= s.substring(i+1,len);
            long number = sol(str1,str2,op);
            answer[i]=number;

        }

        return answer;
    }

    public static long sol(String s1, String s2, String op){
        long value1 = Long.parseLong(s1);
        long value2 = Long.parseLong(s2);
        if(op == "+") {
            return value1+value2;
        }else if(op == "-"){
            return value1-value2;
        }else {
            return value1*value2;
        }

    }

}
