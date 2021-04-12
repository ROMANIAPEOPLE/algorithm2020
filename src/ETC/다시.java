package ETC;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Coffees implements Comparable<Coffees> {
    long endTime;
    int order;

    public Coffees(long endTime, int order) {
        this.endTime = endTime;
        this.order = order;
    }
    public long getEndTime() {
        return endTime;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public int compareTo(Coffees c) {

        if(this.endTime != c.endTime) {
            if(this.endTime > c.endTime) {
                return 1;
            }else if(this.endTime < c.endTime) {
                return -1;
            }
            return 0;
        }
        return this.order - c.order;


    }
}

public class 다시 {

    public static void main(String[] args) {
       다시 s = new 다시();
       int [] arr = {4,2,2,5,3};
        for(int value : s.solution(3, arr)){
            System.out.println(value);
        }

    }

    public int[] solution(int N, int[] coffee_times) {

        List<Integer> answer = new ArrayList<>();
        Queue<Coffees> q = new PriorityQueue<>();
        int order = 0;
        long nowTime = 0;
        int amount = coffee_times.length;
        do {
            while (q.size() < N && order < amount) {
                q.offer(new Coffees(nowTime + coffee_times[order], ++order));
            }

            if(q.isEmpty()) {
                break;
            }

            answer.add(q.peek().getOrder());
            long pollTime = q.poll().getEndTime();
            nowTime = pollTime;

            while(!q.isEmpty() && pollTime == q.peek().getEndTime()) {
                answer.add(q.poll().getOrder());
            }
        }while(order < amount);

        while(!q.isEmpty()) {
            answer.add(q.poll().getOrder());
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }


}
