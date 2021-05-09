package 코드구현력기르기;

import java.util.Scanner;

public class 입력된숫자의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = sc.nextInt();

        int k = 1;
        int lt = 1;
        int rt;
        int cur;

        int result = 0;

        do {
            cur = (n / k) % 10;
            lt = n / (k * 10);
            rt = n % k;

            if (cur > value) {
                result += (lt + 1) * k;
            } else if (cur == value) {
                result += (lt * k) + (rt + 1);
            } else {
                result += lt * k;
            }

            k *= 10;

        } while (lt != 0);

        System.out.println(result);
    }
}
