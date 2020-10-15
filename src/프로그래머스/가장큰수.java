package 프로그래머스;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {

    public String solution(int[] numbers) {

        String [] str = new String[numbers.length];

        StringBuilder builder = new StringBuilder();

        for(int i=0; i<numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(str[0].startsWith("0")) {
            builder.append("0");
            return builder.toString();
        }


        for (String s : str) {
            builder.append(s);
        }

        return builder.toString();

    }


    public static void main(String[] args) {

        int [] str = {3, 30, 34, 5, 9};

        가장큰수 num = new 가장큰수();
        System.out.println(num.solution(str));

    }
}
