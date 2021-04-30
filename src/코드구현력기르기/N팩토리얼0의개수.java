package 코드구현력기르기;

import java.util.Scanner;

/**
 * 1의자리 부터 연속된 0의 개수를 찾는 문제
 * 실제로 N!을 구해서 0의 개수를 구하면 시간초과 발생함.
 * 소인수분해로 총 10의 개수를 구하면 된다. (10은  2*5) 즉, 2와 5중 더 작은 수를 출력하면 됨
 */

public class N팩토리얼0의개수 {
    public static void main(String[] args) {

        int[] arr = new int[1001];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            int temp = i;

            for (int j = 2; j <= Math.sqrt(temp); j++) {
                while (temp % j == 0) {
                    arr[j]++;
                    temp = temp / j;
                }
            }
            if (temp != 1) {
                arr[temp]++;
            }

        }


        System.out.println(Math.min(arr[2], arr[5]));


    }
}
