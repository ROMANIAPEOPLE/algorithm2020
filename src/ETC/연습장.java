package ETC;


import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class 연습장 {

    public static void main(String[] args) {

        int n = 8;
        int [] res = new int[n];

        int count = 1;
        for(int i=0; i<n; i++){
            res[i] = count++;
        }


        for(int rank : res) {
            System.out.println(rank);
        }


    }
}
