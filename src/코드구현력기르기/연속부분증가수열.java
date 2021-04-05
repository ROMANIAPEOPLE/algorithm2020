package 코드구현력기르기;

import java.util.Scanner;

public class 연속부분증가수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int max = -1;
        for(int i=1; i<n; i++) {
            if(arr[i-1] <= arr[i]) {
                count++;
            }else {
                max = Math.max(max,count);
                count = 1;
            }
        }

        System.out.println(max);

    }
}
