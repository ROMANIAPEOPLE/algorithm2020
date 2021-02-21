package 코드구현력기르기;

import java.util.Scanner;

public class 영어단어복구 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' ') {
                builder.append(str.charAt(i));
            }
        }

        System.out.println(builder.toString().toLowerCase());

    }
}
