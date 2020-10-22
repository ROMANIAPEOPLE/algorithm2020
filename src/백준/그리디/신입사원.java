package 백준.그리디;

import java.util.Scanner;

public class 신입사원 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- >0) {
            int n =sc.nextInt();
            int [] arr = new int[n+1];

            for(int i=0; i<arr.length-1; i++){
                arr[sc.nextInt()] = sc.nextInt();
            }

            //s
            int min = arr[1];
            int count = 1; // 서류전형 1등은 무조건 합격임.
            for(int i=2; i<arr.length; i++){
                if(min > arr[i]) {
                    min = arr[i];
                    count++;
                }
            }

            System.out.println(count);

        }
    }
}
