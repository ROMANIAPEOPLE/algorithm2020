package 백준.그리디;

import java.util.Scanner;

public class 설탕딸배 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    static int solution(int n) {
        int res = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                res += n / 5;
                break;
            } else {
                n -= 3;
                res += 1;
            }
        }

        if (n < 0) {
            return -1;
        }
        return res;
    }
}
