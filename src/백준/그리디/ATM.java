package 백준.그리디;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int [] arr = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }



        System.out.println( solution(arr));
    }

    static int solution(int [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum=0;
        int temp=0;
        for(int i=0; i<arr.length; i++){
            temp += arr[i];
            sum += temp;

        }

        return sum;
    }
}
