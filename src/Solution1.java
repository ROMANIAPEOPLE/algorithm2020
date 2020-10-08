import java.util.*;
import java.util.stream.Collectors;
//기능개발
public class Solution1 {
    public static int[] solution(int[] progresses, int[] speeds) {

        //1. 기능개발이 완료되는데 걸리는 기간을 구한다.
        Queue<Integer> q = new LinkedList<>();
        for(int index=0; index<progresses.length; index++) {
            q.add((100-progresses[index]) % speeds[index] == 0 ? (100-progresses[index]) / speeds[index] : (100-progresses[index] / speeds[index]) +1);
        }

        int count =1;
        ArrayList<Integer> list = new ArrayList<>();
        //첫번째 기능부터 남은 일수를 다음 날짜와 비교하면서, 첫번째 날짜가 더 크다면 계속해서 탐색하고, 그렇지 않다면 첫번째 그렇지 않은 날로 바꾼다.
        //count도 1로 초기화해준다.


        int firstDay = q.poll();
        while(!q.isEmpty()) {
            int secondDay = q.poll();
            if(firstDay >= secondDay) {
                count++;
            }

            else {
                firstDay = secondDay;
                list.add(count);
                count =1;
            }

        }

        list.add(count);



        int [] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        int [] progresses = {95, 90, 99, 99, 80, 99};
        int [] speeds = {1,1,1,1,1,1};


        System.out.println(Arrays.toString(solution(progresses,speeds)));

    }
}
