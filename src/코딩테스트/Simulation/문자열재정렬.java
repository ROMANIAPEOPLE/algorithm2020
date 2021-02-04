package 코딩테스트.Simulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 문자열재정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int value = 0;
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                list.add(str.charAt(i));
            }
            else {
                value += str.charAt(i)-'0';
            }

        }

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }

        if(value != 0) {
            System.out.print(value);
        }


    }
}
