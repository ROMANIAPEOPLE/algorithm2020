package 다시풀기;

import java.util.Scanner;

public class N1까정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count =0;
        while(true) {
            if(n<m) {
                break;
            }

            if(n%m == 0) {
                n/=m;
            }else {
                n-=1;
            }
            count++;
        }

        System.out.println(count+n-1);

    }
}
