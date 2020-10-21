package 백준.그리디;

import java.util.Arrays;
import java.util.Scanner;

public class Lope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];


        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int index=1;
        int max = 0;

        for(int i=arr.length-1; i>=0; i--){
            int temp = arr[i] * index;
            if( max < temp){
                max = temp;
            }
            temp =0;
            index++;
        }

        System.out.println(max);
    }

}
