package 코드구현력기르기;

import java.util.Arrays;
import java.util.Scanner;

public class 뒤집은소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            builder.append(sc.next());
            arr[i] = builder.reverse().toString();
        }

        for(int i=0; i<n; i++){
            int value = Integer.parseInt(arr[i]);
            if(isPrime(value)) {
                System.out.println(value);
            }
        }



    }

    private static boolean isPrime(int value) {

        if(value == 2) return false;
        for(int i=2; i<=Math.sqrt(value); i++) {
            if(value % i == 0) {
                return false;
            }
        }
        return true;

    }
}
