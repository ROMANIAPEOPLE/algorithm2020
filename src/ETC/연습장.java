package ETC;


import com.sun.jdi.Value;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class 연습장 {

    public static void main(String[] args) {

        String str = "LIFE IS COOL";
        char[] arr = str.toCharArray();

        StringBuilder builder = new StringBuilder();
        int end = str.length()-1;
        int start = 0;

        while(start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }


    static final String BASE62_CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static final int BASE62 = 62;

    public static String encoding(Long id) {
        StringBuilder builder = new StringBuilder();
        do {
            int idx = (int) (id % BASE62);
            builder.append(BASE62_CHAR.charAt(idx));
            id /= BASE62;
        } while (id > 0);

        //TODO : 8 Character 초과 처리 하기

        return builder.toString();
    }


    public static Long decoding(String url) {
        long sum = 0;
        long power = 1;
        int length = url.length();
        for (int idx = 0; idx < length; idx++) {
            sum += BASE62_CHAR.indexOf(url.charAt(idx)) * power;
            power *= BASE62;
        }

        return sum;
    }
}