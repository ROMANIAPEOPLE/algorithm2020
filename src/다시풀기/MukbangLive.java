package 다시풀기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Mukbang implements Comparable<Mukbang> {
    private int time;
    private int index;

    public Mukbang(int time, int index) {
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
    public int compareTo(Mukbang o2) {
        return this.time - o2.time;
    }
}

public class MukbangLive {

    public static int solution_muji(int[] food_times, int k) {
        int sum = 0;
        for (int i = 0; i < food_times.length; i++) {
            sum += food_times[i];
        }
        // K[멈춘시간] 이 다 지나기 전에 모든 음식을 먹을 경우 -1 리턴
        if (sum <= k) {
            return -1;
        }

        PriorityQueue<Mukbang> heap = new PriorityQueue<>();
        for (int i = 0; i < food_times.length; i++) {
            heap.offer(new Mukbang(food_times[i], i + 1));
        }
        sum = 0;
        int precious = 0;
        int length = heap.size();


        while (sum + ((heap.peek().getTime() - precious) * length) <= k) {
            int now = heap.poll().getTime();
            sum += (now - precious) * length;
            precious = now;
            length -= 1;
        }

        ArrayList<Mukbang> list = new ArrayList<>();
        while (!heap.isEmpty()) {
            list.add(heap.poll());
        }


        Collections.sort(list, (f1,f2) -> {
            return f1.getIndex() - f2.getIndex();
        });

        return list.get((k - sum) & length).getIndex();

    }

    public static void main(String[] args) {
        int [] food = {3,1,2};
        int k =5;
        System.out.println(solution_muji(food, k));
    }


}
