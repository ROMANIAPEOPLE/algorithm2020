package 코드구현력기르기;

import java.util.Scanner;

public class 탄화수소질량 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        int length = arr.length;

        int i;
        int pos;
        int c = 0;
        int h = 0;

        if (arr[1] == 'H') {
            c = 1;
            pos = 1;
        } else {
            for (i = 1; arr[i] != 'H'; i++) {
                c = c * 10 + (arr[i] - '0');
            }
            pos = i;
        }

        if (pos + 1 == length) {
            h = 1;
        } else {
            for (i = pos + 1; i < length; i++) {
                h = h * 10 + (arr[i] - '0');
            }
        }

        System.out.println(c*12 + h);



    }
}
