package 코딩테스트.greedy;

import java.util.*;

class food implements Comparable<food> {

    private int time;
    private int index;

    public food(int time, int index) {
        this.time = time;
        this.index = index;
    }

    public int getTime() {
        return time;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public int compareTo(food f) {
        return this.time - f.time;
    }
}

public class 무지의먹방라이브 {

    public static int solution(int[] food_times, long k) {
        long sum = 0;
        for (int i = 0; i < food_times.length; i++) {
            sum += food_times[i];
        }
        if (sum <= k) {
            return -1;
        }

        PriorityQueue<food> pq = new PriorityQueue<>();
        for (int i = 0; i < food_times.length; i++) {
            pq.offer(new food(food_times[i], i + 1));
        }

        sum = 0;
        long previous = 0;
        long length = pq.size();

        while (sum + ((pq.peek().getTime() - previous) * length) <= k) {
            int now = pq.poll().getTime();
            sum += (now - previous) * length;
            length -= 1;
            previous = now;
        }

        ArrayList<food> list = new ArrayList<>();

        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }

        Collections.sort(list, (f1,f2) ->{
            return f1.getIndex() - f2.getIndex();
        });


        return list.get((int)((k-sum) % length)).getIndex();

    }

    public static void main(String[] args) {

        int [] food_times = {3,1,2};
        int k =5;

        System.out.println(solution(food_times,k));

    }

}
