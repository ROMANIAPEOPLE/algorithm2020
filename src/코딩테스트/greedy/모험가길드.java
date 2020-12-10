package 코딩테스트.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 모험가길드 {
    public static void main(String[] args) {
        //input 처리
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int group =0;
        int result =0;

        for(int i=0; i<n; i++){
            group++;
            if(group>= arr[i]) {
                result+=1;
                group = 0;
            }
        }

        System.out.println(result);



    }
}
