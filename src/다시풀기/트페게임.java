package 다시풀기;

import java.util.Scanner;

public class 트페게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] card = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                card[i][j] = sc.nextInt();
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                min = Math.min(min,card[i][j]);
            }
            max = Math.max(min,max);
            min = Integer.MAX_VALUE;
        }

        System.out.println(max);

    }
}
