package ETC;

import java.util.ArrayList;
import java.util.Arrays;

public  class abstractTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String [] s = new String[10];
        String [] str = list.toArray(s);
        for(String temp : str){
            System.out.println(temp);
        }
    }

}
