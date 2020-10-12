package 프로그래머스;

import java.util.Arrays;

//전화번호부
public class 전화번호부 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length-1; i++){
            for(int j=i+1; i<phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) {
                    return false;
                }
            }
        }

        return true;
    }
}
