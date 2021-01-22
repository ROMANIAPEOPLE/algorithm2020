package 다시풀기;

import java.util.Arrays;
import java.util.Scanner;

public class CannotBeMadeAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int target = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i] <= target) {
                target+= arr[i];
            }else {
                break;
            }
        }

        System.out.println(target);



    }
}
