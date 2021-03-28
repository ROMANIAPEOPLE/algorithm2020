package 코드구현력기르기;

import java.util.*;

public class 가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] aArr = new int[n];
        int[] bArr = new int[n];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bArr[i] = sc.nextInt();
        }


        for(int i=0; i<n; i++) {
            if(aArr[i] == bArr[i]) {
                builder.append("D");
            }else if (aArr[i] == 2 && bArr[i] == 1) builder.append("A");
            else if(aArr[i] ==  3 && bArr[i] == 2) builder.append("A");
            else if (aArr[i] == 1 && bArr[i] == 3) builder.append("A");
            else {
                builder.append("B");
            }
        }


        System.out.println(builder.toString());


    }
}
