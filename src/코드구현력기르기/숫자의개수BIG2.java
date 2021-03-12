package 코드구현력기르기;

import java.util.Scanner;

public class 숫자의개수BIG2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digit = 1; //자릿수
        int value = 0; //비교할 값
        int count = 9; // 9,90,900 씩 늘어나기 때문에 초기값은 9
        int result = 0; //정답

        long n = sc.nextLong();

        while (value + count < n) {
            result += (count * digit);
            value += count;
            digit++;
            count *= 10;
        }

        result += (n - value) * digit;

        System.out.println(result);

    }
}
