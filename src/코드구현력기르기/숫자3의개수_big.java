package 코드구현력기르기;

import java.util.Scanner;

/**
 * Google Interview
 * 5367 이라는 숫자가 있으면 각 자리수를 기준으로 3이 몇번 나오는지 체크하는 식으로 접근해야 한다.
 * 예를들어, 10의자리가 3일때 1의자리는 0~9니까 총 10번이 등장한다.
 * 마찬가지로 100의자리가 3일때 0~99까지 총 100번이 등장한다.
 * 1000의자리가 3일때 0~999까지 총 1000번이 등장한다.
 */
public class 숫자3의개수_big {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k = 1;
        int cur;
        int rt;
        int lt = 1;

        int result = 0;
        while (lt != 0) {

            cur = (n / k) % 10;
            rt = n % k;
            lt = n / (k * 10);

            if (cur > 3) {
                result += (lt + 1) * k;
            } else if (cur == 3) {
                result += (lt * k) + (rt + 1);
            } else {
                result += (lt * k);
            }

            k *= 10;
        }

        System.out.println(result);

    }
}
