package 백준.그리디;

import java.util.Scanner;

public class 전자렌지2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A=0;
        int B=0;
        int C=0;

        while(T>=10) {
            if(T>=300) {
                T-=300;
                A++;
            }else if(T>=60) {
                T-=60;
                B++;
            }else {
                T-=10;
                C++;
            }
        }

        System.out.println(T!=0 ? -1 : A+ " " + B + " " + C);

    }


}
