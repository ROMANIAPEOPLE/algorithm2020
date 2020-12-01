package 탐색.기초;

import java.util.Scanner;

public class 떡볶이떡만들기ver2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] arr = new int[n];

        for(int i=0; i<n; i ++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = arr[n-1];

        int h =0; //result
        while(start <=end ){
            int sum=0;
            int mid = (start+end)/2;

            for(int i=0; i<n; i++){ //고객이 가져가는 떡 구하는 for문
                if(arr[i] > mid) {
                    sum += arr[i]-mid;
                }
            }
            if(sum >= m ){
                start = mid+1;
                h= mid;
            }else {
                end = mid-1;
            }

        }
        System.out.println(h);

    }
}
