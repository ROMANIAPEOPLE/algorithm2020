package 코딩테스트.Simulation;

import java.util.Scanner;

public class 럭키스트레이트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int res = 0;

        for(int i=0; i<input.length()/2; i++){
            res += input.charAt(i)-'0';
        }

        for(int i=input.length()/2; i<input.length(); i++){
            res -= input.charAt(i)-'0';
        }


        if(res == 0) {
            System.out.println("LUCKY");
        }else {
            System.out.println("READY");
        }

    }
}
