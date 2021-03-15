package 코드구현력기르기;

import java.util.Scanner;

/**
 * 배열을 맨 뒤부터 MAX값을 갱신하면서 탐색
 * max로 갱신되는 순간 분노유발자임
 */

public class 분노유발자2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[arr.length-1];

        int count = 0;
        for(int i=arr.length-2; i>=0; i--) {
            if(max < arr[i]) {
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);

    }
}
