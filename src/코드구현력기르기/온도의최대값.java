package 코드구현력기르기;

import java.util.Scanner;

public class 온도의최대값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int max = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum =0;

        for(int i=0; i<=n-k; i++) {
            for(int j=i; j<i+k; j++){
                sum+=arr[j];
            }
            max = Math.max(max,sum);
            sum = 0;
        }

        System.out.println(max);


    }
}
