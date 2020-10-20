package 백준.그리디;

import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int price = 1000-n; //620

        int [] arr = {500,100,50,10,5,1};

        int count =0;
        for(int i=0; i<arr.length && price>0; i++){
            if(price >= arr[i]) {
                count += price/arr[i];
                price%=arr[i];
            }
        }
        System.out.println(count);
    }
}
