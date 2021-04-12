package 코드구현력기르기;

import java.util.Arrays;
import java.util.Scanner;

public class JollyJumpers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;//수열의 범위를 지정
        n = sc.nextInt();
        int[] arData = new int[n];
        int num = 0;
        int[] temp = new int[n - 1];
        int[] jol = new int[n - 1];
        int Cnt = 0;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arData[i] = num;
        }
        for (int i = 0; i < temp.length; i++) {
            if (0 > arData[i] - arData[i + 1]) {
                temp[i] = -(arData[i] - arData[i + 1]);
            } else {
                temp[i] = arData[i] - arData[i + 1];
            }
        }
        Arrays.sort(temp);

        for (int i = 0; i < jol.length; i++) {
            jol[i] = i + 1;
            if (jol[i] == temp[i]) {
                Cnt++;
            }
        }
        if (Cnt == n - 1) {
            System.out.println("Jolly");
        } else {
            System.out.println("Not Jolly");
        }
    }
}