package 백준.그리디;
import java.util.Scanner;

public class 동전0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int count =0;
        for(int i=arr.length-1; i>=0 && k>0 ; i--){
            if(k >= arr[i]) {
                count += k/arr[i];
                k = k%arr[i];
            }

        }

        System.out.println(count);

    }


}
