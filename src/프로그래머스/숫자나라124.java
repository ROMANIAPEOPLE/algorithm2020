package 프로그래머스;

import org.w3c.dom.ls.LSOutput;

public class 숫자나라124 {

    public  String solution(int n) {
        String ans = "";

        while(n!=0) {
            int temp = n%3;
            n = n/3;

            if(temp == 0){
                temp = 4;
                n--;

            }
            ans=temp+ans;
        }

        return ans;
    }


    public static void main(String[] args) {
        숫자나라124 s = new 숫자나라124();
        System.out.println(s.solution(12));
    }



}
