package 코딩테스트.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 곱혹플 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //0이거나 1일때는 + 여야함.

        int num = str.charAt(0)-'0';

        for(int i=1; i<str.length(); i++){
            int nextNum = str.charAt(i)-'0';

            if(num == 0 || num == 1 || nextNum == 0 || nextNum == 1) {
                num+=nextNum;
            }else {
                num*=nextNum;
            }

        }
        System.out.println(num);


     }
}
