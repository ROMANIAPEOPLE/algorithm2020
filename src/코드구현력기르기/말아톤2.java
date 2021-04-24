package 코드구현력기르기;

import java.util.Scanner;

/**
 * 자신보다 낮은 노력지수가 아닌 높거나 같은 노력지수를 구하면, 그 값 + 1이 꿈 꿀수 있는 등수가 나온다.
 */

public class 말아톤2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        res[0] = 1;

        for (int i = n - 1; i >= 1; i--) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] <= arr[j]) {
                    count++;
                }
            }

            res[i] = count + 1;

        }

        for (int rank : res) {
            System.out.print(rank + " ");
        }

    }
}
