package 코드구현력기르기;

import java.util.Scanner;

public class 자릿수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int temp = digit_sum(value);
            if (temp >= sum) {
                if (temp == sum) {
                    ans = Math.max(ans, value);
                }
                sum = temp;
                ans = value;
            }
        }
        System.out.println(ans);
    }

    private static int digit_sum(int value) {
        int temp = 0;
        int sum = 0;

        while (value > 0) {
            temp = value % 10;
            sum += temp;
            value /= 10;
        }

        return sum;
    }
}
