package 코드구현력기르기;

import java.util.Scanner;

public class 소수의개수_1초 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] arr = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
        int count =0;
        for(int i=2; i<=n; i++) {
            if(!arr[i]) {
                count++;
            }
        }

        System.out.println(count);


    }
}
