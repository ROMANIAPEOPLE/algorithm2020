package 코드구현력기르기;

import java.util.Scanner;

public class 나이계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int year = 0;

        /**
         * 주민등록번호 뒷자리의 첫 번째 자리가 1 또는 2면, 1900년대생
         * 주민등록번호 뒷자리의 첫 번째 자리가 3 또는 4면, 2000년대생
         */

        if (arr[7] == '1' || arr[7] == '2') {
            year += 1900 + (arr[0] - '0') * 10 + (arr[1] - '0');
        } else {
            year += 2000 + (arr[0] - '0') * 10 + (arr[1] - '0');
        }

        year = 2019 - year + 1;

        if(arr[7] == '1' || arr[7] == '3') {
            System.out.println(year + " M");
        }else {
            System.out.println(year + " W");
        }

    }
}
