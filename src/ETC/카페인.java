package ETC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class 카페인 {
    public int[] solution(int N, int[] coffee_times) {
        List<Integer> answer = new ArrayList(coffee_times.length);
        Queue<Coffee> q = new PriorityQueue<>();
        int amount = coffee_times.length;
        int order = 0;
        long nowTime = 0;
        do {
            while (q.size() < N && order < amount) {
                q.offer(new Coffee(nowTime + coffee_times[order], ++order));
            }
            if (q.isEmpty()) {
                break;
            }
            answer.add(q.peek().getOrder());
            long pollTime = q.poll().getEndTime();
            nowTime = pollTime;
            while (!q.isEmpty() && q.peek().getEndTime() == pollTime) {
                answer.add(q.poll().getOrder());
            }
        } while (order < amount);
        while (!q.isEmpty()) {
            answer.add(q.poll().getOrder());
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

class Coffee implements Comparable<Coffee> {
    long endTime;
    int order;

    public Coffee(long endTime, int order) {
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
    public int compareTo(Coffee coffee) {
        if (this.endTime != coffee.getEndTime()) {
            if (this.endTime > coffee.getEndTime()) {
                return 1;
            } else if (this.endTime < coffee.getEndTime()) {
                return -1;
            }
            return 0;
        }
        return this.getOrder() - coffee.getOrder();
    }
}