package 다시풀기;

import java.util.Scanner;

public class 시각3포함 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<=n; i++){
            for(int j=0; j<60; j++){
                for(int k=0; k<60; k++){
                    String str = String.valueOf(i)+String.valueOf(j)+String.valueOf(k);
                    if(str.contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
