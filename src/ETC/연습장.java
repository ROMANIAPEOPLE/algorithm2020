package ETC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 연습장  {

    public static void main(String[] args) {

        String str = "(a)())()";

        for(int i=0; i<str.length(); i++){
            String newStr = str.substring(0,i) +str.substring(i+1);
            System.out.println(newStr);


        }

        System.out.println(str.substring(0,1));


    }
}
