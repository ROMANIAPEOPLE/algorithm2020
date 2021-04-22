package 코드구현력기르기;

import java.util.Arrays;
import java.util.Scanner;

public class 석차구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        int[] res = new int[n];
        Arrays.fill(res,1);

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j) continue;
                if(arr[i] <arr[j]) {
                    res[i]++;
                }

            }
        }

        for(int rank : res) {
            System.out.print(rank + " ");
        }


    }
}
