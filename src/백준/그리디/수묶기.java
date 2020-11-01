package 백준.그리디;

import java.util.Arrays;
import java.util.Scanner;

public class 수묶기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int left=0; //음수담당
        int right = n-1; //양수담당
        int max =0;
        for(; left<right; left+=2 ){
            if(arr[left] <1 && arr[left+1] <1) {
                max += arr[left] * arr[left+1];
            }else {
                break;
            }
        }

        for(; left<right; right-=2) {
            if(arr[right] >1 && arr[right-1] >1) {
                max += arr[right] * arr[right-1];
            }else {
                break;
            }
        }



        for(int i=left; i<=right; i++){
            max+=arr[i];
        }
        System.out.println(max);
    }
}
