package 탐색.기초;

import java.util.Arrays;
import java.util.Scanner;
//counting sort로 찾기
public class 부품찾기ver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[1000001];
        for(int i=0; i<n; i++){
             int x = sc.nextInt();
             arr[x] =1;
        }

        int m =sc.nextInt();
        int [] target = new int[m];
        for(int i=0; i<m; i++){
            target[i] = sc.nextInt();
        }


        for(int i=0; i<m; i++){
            if(arr[target[i]] == 1) {
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
        }


    }
}
