package 코드구현력기르기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr1 = sc.nextLine().toCharArray();
        char[] arr2 = sc.nextLine().toCharArray();

        int[] res1 = new int[123];
        int[] res2 = new int[123];

        int length = arr1.length;

        for (int i = 0; i < length; i++) {
            if (arr1[i] >= 65 || arr1[i] <= 90) {
                res1[arr1[i] - 64]++;
            } else {
                res1[arr1[i] - 70]++;
            }
        }

        for (int i = 0; i < length; i++) {
            if (arr2[i]  >= 65 || arr2[i] <= 90) {
                res2[arr2[i] - 64]++;
            } else {
                res2[arr2[i] - 70]++;
            }
        }

        boolean check = true;
        for (int i = 0; i < res1.length; i++) {
            if (res1[i] != res2[i]) {
                check = false;
            }
        }

        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
