package 코딩테스트.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수의법칙ver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K= sc.nextInt();
        int [] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int last1 = arr[N-1];
        int last2 = arr[N-2];
        int sum =0;

        int count = (M/(K+1)*K)+M%(K+1);
        sum += count*last1;

        sum+= (M-count)*last2;

        System.out.println(sum);


    }
}
