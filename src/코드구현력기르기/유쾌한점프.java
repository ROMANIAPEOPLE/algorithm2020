package 코드구현력기르기;
/**
 * 1. 중복된 값이 배열에 들어가면 break / NO
 * 2. N-1보다 큰 값이 나오면 break / NO
 */

import java.util.Scanner;

public class 유쾌한점프 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean result = true;

        int[] check = new int[n];
        int[] val = new int[n];

        for (int i = 0; i < n; i++) {
            check[i] = sc.nextInt();
        }


        int pre = check[0];

        for (int i = 1; i < n; i++) {
            int now = check[i];
            int value = Math.abs(pre - now);

            if (val[value] != 0 || value > n - 1) {
                result = false;
                break;
            }
            val[value]++;
            pre = now;
        }

        if(result) {
            for(int i = 1; i< n; i++) {
                if(val[i] == 0) {
                    result = false;
                }
            }
        }


        if(result) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }




    }
}
