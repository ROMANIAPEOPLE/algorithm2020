package 다시풀기;

import java.util.Scanner;

public class BowlingBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] weight = new int[11];

        for (int i = 0; i < N; i++){
            weight[sc.nextInt()]++;
        }

        int res  = 0;

        for(int i=1; i<=M; i++){
            N -= weight[i];
            res += N*weight[i];
        }

        System.out.println(res);

    }
}
