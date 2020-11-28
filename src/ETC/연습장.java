package ETC;

import java.util.*;
import java.util.stream.Collectors;

public class 연습장  {

    public static void main(String[] args) {

        int [] arr = new int[5];
        try {
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("예이");
        }
        finally {
            System.out.println("dd");
        }

    }
}
