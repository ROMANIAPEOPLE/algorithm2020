package ETC;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 연습장 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        int col = str.charAt(1)-'0';
        int row = str.charAt(0)-'a'+1;

        System.out.println(col + " " + row);

    }
}
