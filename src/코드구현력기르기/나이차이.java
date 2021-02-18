package 코드구현력기르기;

import java.util.Scanner;

public class 나이차이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i=0; i<n; i++){
            int value = sc.nextInt();
            min = Math.min(min, value);
            max = Math.max(max, value);
        }

        System.out.println(max-min);


    }
}
