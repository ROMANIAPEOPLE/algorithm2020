package 프로그래머스;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution4 {
    public static int solution(int[] priorities, int location) {

        int answer =1;
        Queue<Printer> q = new LinkedList<>();
        for(int i=0; i< priorities.length; i++){
            q.add(new Printer(priorities[i],i));
        }

        while (true) {
            Printer firstDocu = q.poll();
            Iterator it = q.iterator();
            boolean ck=true;
            while (it.hasNext()) {
                Printer value =(Printer) it.next();
                if(firstDocu.pri < value.pri) {
                    q.add(firstDocu);
                    ck = false;
                    break;
                }
            }
            if(ck) {
                if(firstDocu.num == location) {
                    break;
                } else {
                    answer++;
                }

            }
        }

        return answer;

    }

    public static void main(String[] args) {
        int [] arr = {1, 1, 9, 1, 1, 1};
        System.out.println(solution(arr,0));
    }
}
