package 코드구현력기르기;

import java.util.Scanner;

public class 자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum  = 0;
        StringBuilder builder = new StringBuilder();
        for(int i=A; i<=B; i++) {
            sum+=i;
            if(i == B) {
                builder.append(i);
                builder.append("=");
                break;
            }

            builder.append(i);
            builder.append("+");
        }

        builder.append(sum);
        System.out.println(builder.toString());

    }
}
