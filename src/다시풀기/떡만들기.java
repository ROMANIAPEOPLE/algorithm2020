package 다시풀기;

import java.util.Arrays;
import java.util.Scanner;

public class 떡만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);


        System.out.println(getTarget(arr, target, 0, arr[arr.length - 1]));
    }

    //target > total 이면 stop
    public static int getTarget(int[] arr, int target, int start, int end) {

        int startIdx = 0;
        int endIdx = arr.length - 1;
        int res = 0;

        while (start <= end) {
            int sum = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] - mid >= 0) {
                    sum += arr[i] - mid;
                    System.out.println(sum);
                }
            }
            if (sum >= target) {
                start = arr[startIdx++];
                res = mid;
            } else {
                end = arr[endIdx--];
            }

        }

        return res;


    }
}
