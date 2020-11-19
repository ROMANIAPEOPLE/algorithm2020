package 코딩테스트.Simulation;

import java.util.Scanner;

public class 시각_개선 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();

        int count =0;
        for(int i=0; i<=N; i++){
            for(int j=0; j<60; j++){
                for(int z=0; z<60; z++){
                  if(check(i,j,z)) {
                      count++;
                  }
                }
            }
        }
        System.out.println(count);

    }
    public static boolean check(int h, int m, int s){
        if(h%10 ==3 || m/10 == 3 || m%10 == 3 || s/10 == 3 || s%10 ==3) {
            return true;
        }
        return false;
    }
}
