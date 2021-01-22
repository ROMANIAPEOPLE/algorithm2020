package 다시풀기;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StringFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count0 = 0; //0으로 뒤짚는 경우
        int count1 = 0; //1로 뒤짚는 경우

        char s = str.charAt(0);
        if(s == '0') {
            count1++;
        }else {
            count0++;
        }

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) != str.charAt(i)) {
                if(str.charAt(i) == '0') {
                    count1++;
                }else {
                    count0++;
                }
            }
        }

        System.out.println(Math.min(count0,count1));
    }


}
