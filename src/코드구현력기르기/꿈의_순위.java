package 코드구현력기르기;

import java.util.Scanner;

public class 꿈의_순위 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] effort = new int[n];
        int[] rank = new int[n];

        rank[0] = 1;

        for (int i = 0; i < n; i++) {
            effort[i] = sc.nextInt();
        }


        int count = 0;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(effort[i] <= effort[j]) {
                    count++;
                }
            }
            rank[i] = count+1;
            count = 0;
        }


        for (int ranks : rank) {
            System.out.print(ranks + " ");
        }


    }
}
