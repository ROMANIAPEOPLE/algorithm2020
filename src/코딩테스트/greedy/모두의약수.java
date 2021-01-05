package 코딩테스트.greedy;

import java.util.Scanner;

public class 모두의약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()+1];

        for(int i=1; i<arr.length; i++){
            for(int j=i; j<arr.length; j+=i) {
                arr[j]++;
            }
        }

        for(int i=1; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}

/**
 * 단순 2중포문으로 풀면 시간초과
 * 풀이
 * 자기 자신의 약수는 자기 자신이라는 점과, 그 약수의 배수는 모두 약수라는 점을 이해하여 풀이
 * 1의 약수는 1, 1의 배수는 모두 1을 약수로 가진다.
 */
