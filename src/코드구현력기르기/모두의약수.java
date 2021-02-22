package 코드구현력기르기;

import java.util.Scanner;

public class 모두의약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 1; i < arr.length; i++) {
            for(int j=i; j<arr.length; j+=i) {
                arr[j]++;
            }
        }

        for(int i=1; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
