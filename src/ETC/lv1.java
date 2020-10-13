package ETC;

import java.util.Arrays;

public class lv1 {
    public static String solution(String  a , String key) {

        int j =0;
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            if( j >=key.length()) {
                builder.append(a.charAt(i));
                continue;
            }

            if(a.charAt(i) == key.charAt(j)){
                j++;
            }else  {
                builder.append(a.charAt(i));
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {

        String a = "acbbcdc";
        String key = "abc";

        System.out.println(solution(a,key));

    }
}
