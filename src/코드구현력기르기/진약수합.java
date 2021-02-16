package 코드구현력기르기;

import java.util.Scanner;

public class 진약수합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1;
        StringBuilder builder = new StringBuilder("1");
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                sum += i;
                builder.append("+");
                builder.append(i);
            }
        }

        builder.append("=" + sum);
        System.out.println(builder.toString());
    }
}
