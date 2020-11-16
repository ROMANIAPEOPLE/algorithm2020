package ETC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public  class abstractTest {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();


        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);


        for (int i : map.values()) {
            System.out.println(i);
        }

    }

}
