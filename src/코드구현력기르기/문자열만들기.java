package 코드구현력기르기;

import java.util.HashMap;
import java.util.Map;

public class 문자열만들기 {
    public static void main(String[] args) {

        String str = "5A12BXV5B";
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < arr.length; i++){

            if(!Character.isLetter(arr[i])) {
                builder.append(arr[i]);
            }else {
                if(builder.toString().equals("")) {
                    res.append(arr[i]);
                    continue;
                }
                int value = Integer.parseInt(builder.toString());
                builder.delete(0, builder.length());

                for(int j = 0; j < value; j++) {
                    res.append(arr[i]);
                }
            }
        }
        System.out.println(res.toString());
    }
}
