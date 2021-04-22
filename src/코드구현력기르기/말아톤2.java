package 코드구현력기르기;

import java.util.Scanner;

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
