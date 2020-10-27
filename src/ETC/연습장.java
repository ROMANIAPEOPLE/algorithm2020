package ETC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 연습장 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<4; i++){
            list.add(1);
        }

        list.add(2,111);

        list.remove(3);


        for (Integer integer : list) {
            System.out.println(integer);
        }







    }
}
