package 코드구현력기르기;

import java.util.Scanner;

/**
 * 자연수 N이 입력되면 1부터 N까지의 수 중 M의 배수의 합을 구하는 프로그램을 작성하세요.
 */
public class N까지의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

    }
}
