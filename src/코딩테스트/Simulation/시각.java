package 코딩테스트.Simulation;

import java.util.Arrays;
import java.util.Scanner;

//15분 , 난이도 하
public class 시각 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < 60; j++) {
                for (int z = 0; z < 60; z++) {
                    String time = String.valueOf(i)+String.valueOf(j)+String.valueOf(z);
                    if(time.contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

