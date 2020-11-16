package 코딩테스트.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수의법칙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int [] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int count =0;
        int sum =0;
        int last = arr.length-1;
        for(int i=0; i<M; i++) {
            if (count < K) {
                count++;
                sum += arr[last];
            }
            else {
                sum+= arr[last-1];
                count =0;
            }
        }


        System.out.println(sum);


    }
}
