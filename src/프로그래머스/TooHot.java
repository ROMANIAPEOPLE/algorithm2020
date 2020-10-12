package 프로그래머스;

import java.util.PriorityQueue;
import java.util.Queue;

public class TooHot {
    public  int solution(int[] scoville, int K) {
        int answer = 0;

        Queue<Integer> queue = new PriorityQueue<>();
        for (Integer scovilleValue : scoville) {
            queue.add(scovilleValue);
        }

        while (queue.peek() <= K) {
            if(queue.size() == 1){
                return -1;
            }

            int newScovilleValue = (queue.poll()) + (queue.poll() * 2);
            queue.add(newScovilleValue);
            answer++;
        }
        return answer;

    }

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 9, 10, 12};
        TooHot t = new TooHot();
        System.out.println(t.solution(a,7));
    }
}
