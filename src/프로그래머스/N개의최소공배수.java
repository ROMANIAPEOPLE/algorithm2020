package 프로그래머스;

import java.util.Arrays;

public class N개의최소공배수 {

    public int solution(int[] arr) {
        Arrays.sort(arr);

        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }


    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}