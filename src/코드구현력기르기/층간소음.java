package 코드구현력기르기;

import java.util.Scanner;

public class 층간소음 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int max = -1;
        int count = 0;
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            if(value > M) {
                count++;
            }else {
                count=0;
            }
            max = Math.max(max,count);
        }

        if(max == 0 ){
            System.out.println(-1);
        }else {
            System.out.println(max);
        }


    }
}
