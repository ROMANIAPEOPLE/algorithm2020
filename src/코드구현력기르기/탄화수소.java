package 코드구현력기르기;

import java.util.Scanner;

public class 탄화수소 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] hydrocarbons = sc.next().toCharArray();

        int c = 0;
        int h = 0;
        int pos = 0;
        int i;
        int length = hydrocarbons.length;
        if (hydrocarbons[1] == 'H') {
            c = 1;
        } else {
            for (i = 1; hydrocarbons[i] != 'H'; i++) {
                c = c * 10 + (hydrocarbons[i] - '0');
            }
            pos = i;
        }

        if (pos + 1 == length) {
            h = 1;
        } else {
            for (i = pos + 1; i < length; i++) {
                h = h * 10 + (hydrocarbons[i] - '0');
            }
        }

        System.out.println(c*12 + h);



    }
}
