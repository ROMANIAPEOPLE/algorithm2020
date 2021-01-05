package ETC;

import java.util.Scanner;

public class 에라토스테네스의체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n 이하의 소수를 출력합니다.");
        System.out.println("n 입력 :");
        boolean[] prime = new boolean[sc.nextInt() + 1];

        for (int i = 2; i < prime.length; i++) {
            if (!prime[i]) {

                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = true;
                }

            }
        }

        for(int i=2; i<prime.length; i++){
            if(!prime[i]) {
                System.out.print(i + " ");
            }
        }


    }
}
