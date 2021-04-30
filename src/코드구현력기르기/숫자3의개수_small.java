package 코드구현력기르기;

import java.util.Scanner;

public class 숫자3의개수_small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i < n; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == 3) {
                    count++;
                }
                temp = temp / 10;
            }
        }

        System.out.println(count);


    }
}
