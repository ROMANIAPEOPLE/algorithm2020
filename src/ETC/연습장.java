package ETC;


import java.util.Arrays;
import java.util.Comparator;

public class 연습장 {

    public static void main(String[] args) {

        String s = "abcd";

        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<=s.length(); j++){
                if(i==j) continue;
                System.out.println(s.substring(i,j) + " / "+ i + " , " + j);
            }
        }

//        System.out.println(s.substring(0,4));




    }
}
