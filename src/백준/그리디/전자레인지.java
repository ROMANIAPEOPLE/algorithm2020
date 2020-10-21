package 백준.그리디;

import java.util.Scanner;

public class 전자레인지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int [] arr = new int[3];
        arr[0] = 300;
        arr[1] = 60;
        arr[2] = 10;

        int [] count  = new int[3];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < T) {
                count[i]+= T/arr[i];
                T= T%arr[i];
            }
        }

        if(T ==0) {
            for (int i : count) {
                System.out.print(i+" ");
            }
        }else {
            System.out.println(-1);
        }

    }
}
