import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    public static int solution(int[] priorities, int location) {
        Queue<Printer> q = new LinkedList<>();

        for(int i=0; i<priorities.length; i++){
            q.add(new Printer(priorities[i],i));
        }
        int answer = 1;

        while(true) {
            Printer firstDocument = q.poll();
            boolean ck = true;
            Iterator it = q.iterator();
            while(it.hasNext()) {
                Printer document = (Printer) it.next();
                if(firstDocument.pri < document.pri) {
                    q.add(firstDocument);
                    ck = false;
                    break;
                }
            }
            if(ck) {
                if(firstDocument.num == location) {
                    break;
                }else {
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

class Printer{
    int pri;
    int num;

    public Printer(int pri, int num){
        this.pri = pri;
        this.num = num;
    }
}
