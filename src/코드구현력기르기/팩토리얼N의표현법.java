package 코드구현력기르기;

import java.util.Scanner;

public class 팩토리얼N의표현법 {
    public static void main(String[] args) {

        int[] arr = new int[1001];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            int temp = i;

            for (int j = 2; j <= Math.sqrt(temp); j++) {
                while (temp % j == 0) {
                    arr[j]++;
                    temp = temp / j;
                }
            }
            if (temp != 1) {
                arr[temp]++;
            }

        }

        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
