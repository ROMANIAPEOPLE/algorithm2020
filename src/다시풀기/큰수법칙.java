package 다시풀기;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 큰수법칙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum =0;
        int temp=0;
        Arrays.sort(arr);


        for(int i=0; i<k; i++){
            if(temp < m) {
                sum+=arr[n-1];
                temp++;
            } else {
                sum+=arr[n-2];
                temp=0;
            }
        }
        System.out.println(sum);



    }
}
