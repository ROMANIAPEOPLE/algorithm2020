package 코딩테스트.greedy;

import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int[] money = {500, 100, 50, 10};

        for (int i = 0; i < money.length && N!=0; i++) {

            count += N/money[i];
            N%= money[i];


        }
        System.out.println(count);

    }
}
