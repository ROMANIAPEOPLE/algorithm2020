package ETC;


import java.util.Arrays;
import java.util.Comparator;

public class 연습장 {

    public static void main(String[] args) {

        String s = "23";

        StringBuilder builder = new StringBuilder(s);

        int n = Integer.parseInt(String.valueOf(builder.reverse()));

        System.out.println(n);



    }
}
