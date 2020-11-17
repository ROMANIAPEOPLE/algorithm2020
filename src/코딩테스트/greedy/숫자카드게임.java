package 코딩테스트.greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class 숫자카드게임 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int maxValue =0;
        int minxValue = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int x = sc.nextInt();
                minxValue=Math.min(minxValue,x);
            }

            maxValue=Math.max(maxValue,minxValue);
            minxValue=Integer.MAX_VALUE;
        }
        System.out.println(maxValue);

    }
}
