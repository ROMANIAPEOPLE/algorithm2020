package 코드구현력기르기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 가장많이사용된자리수 {
    public static void main(String[] args) {

        int[] count = new int[10];

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        char[] arr = String.valueOf(n).toCharArray();

        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - '0']++;
        }

        System.out.println(Arrays.toString(count));

        int max = -1;
        int maxValue = -1;
        for (int i = 0; i < count.length; i++) {
            if (max <= count[i]) {
                max = count[i];
                maxValue = i;
            }
        }
        System.out.println(maxValue);

    }
}