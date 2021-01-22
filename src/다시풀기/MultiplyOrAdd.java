package 다시풀기;

import java.util.Scanner;

public class MultiplyOrAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int sum = str.charAt(0) - '0';

        for (int i = 1; i < str.length(); i++) {
            int next = str.charAt(i) - '0';

            if (sum == 0 || sum == 1 || next == 0 || next == 1) {
                sum+=next;
            }else {
                sum*=next;
            }
        }

        System.out.println(sum);

    }
}
