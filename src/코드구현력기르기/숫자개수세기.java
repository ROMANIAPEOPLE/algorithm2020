package 코드구현력기르기;

import java.util.Scanner;

public class 숫자개수세기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digit = 1;
        int count = 9;
        int result = 0;
        int temp = 0;

        while (temp + count < n) {
            result += (count * digit);
            temp += count;
            digit++;
            count *= 10;
        }

        result += (n - temp) * digit;

        System.out.println(result);

    }
}
