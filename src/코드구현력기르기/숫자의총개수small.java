package 코드구현력기르기;

import java.util.Scanner;

public class 숫자의총개수small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += get_digit(i);
        }

        System.out.println(sum);
    }

    private static int get_digit(int i) {
        int count = 0;

        while(i > 0) {
            count++;
            i /= 10;
        }

        return count;
    }
}
