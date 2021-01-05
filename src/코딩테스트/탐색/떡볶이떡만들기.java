package 코딩테스트.탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 떡볶이떡만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr[arr.length-1];
        int startIndex =0;
        int endIndex = arr.length-1;
        int h =0;
        while(start<=end) {
            int mid = (start+end)/2;
            if(getH(mid,arr,m)) { // M보다 더 크다면 ?
                    h= mid;
                    start = arr[startIndex++];
            }else {
                end = arr[endIndex--];
            }
        }

        System.out.println(h);
    }

    public static boolean getH(int mid, int [] arr,int m) {

        int sum=0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] - mid >= 0) {
                sum += arr[i] - mid;
                System.out.println(sum);
            }
        }
        if(sum >= m) {
            return true;
        }
        return false;

    }
}
