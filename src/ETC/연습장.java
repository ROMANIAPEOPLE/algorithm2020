package ETC;


import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class 연습장 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A",1);
        map.put("A",2);

        System.out.println(map.get("A"));


    }
}
