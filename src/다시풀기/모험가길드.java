package 다시풀기;

import java.util.Arrays;
import java.util.Scanner;

public class 모험가길드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum =0;
        int res =0;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            sum++;
            if(sum >= arr[i]) {
                res++;
                sum = 0;
            }
        }
        System.out.println(res);
    }
}
