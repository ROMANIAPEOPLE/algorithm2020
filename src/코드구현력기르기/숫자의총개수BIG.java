package 코드구현력기르기;

import java.util.Scanner;

public class 숫자의총개수BIG {
    public static void main(String[] args) {
        int digit = 1; // (자리수)
        int res = 0; // 숫자의 개수(정답)
        int sum = 0; //  주어진 N의 값을 비교해야함.
        int count = 9; // 1~9는 9개, 10~99는 90 .... 이런식으로 늘어나기 때문에 초기값을 9로 잡음
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (sum + count < n) {
            res += (digit * count);
            sum += count;

            digit++;
            count *= 10;
        }


        res += (n - sum) * digit;

        System.out.println(res);


    }
}
