package 코드구현력기르기;

import java.util.Scanner;

public class 에라토스테네스의체2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean [] arr = new boolean[n+1];

        arr[0] = arr[1] = true ;

        for(int i=2; i < arr.length; i++) {
            for(int j=2; i*j < arr.length; j++) {
                arr[i*j] = true;
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
        }
    }
}
