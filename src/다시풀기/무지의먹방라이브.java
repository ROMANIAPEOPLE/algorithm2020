package 다시풀기;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class 무지의먹방라이브 {

    public static int solution_muji(int[] food_times, int k) {
        PriorityQueue<Mukbang> heap = new PriorityQueue<>();

        int sum = 0;
        for(int i=0; i<food_times.length; i++){
            sum += food_times[i];
        }

        if(sum <= k) {
            return -1;
        }

        sum = 0;

        for(int i=0; i<food_times.length; i++){
            heap.offer(new Mukbang(food_times[i], i+1));
        }

        int length  = food_times.length;
        int pre = 0;

        while(sum + ((heap.peek().getTime()- pre) * length) <= k) {
            int now = heap.poll().getTime();
            sum += (now - pre) *length;
            pre = now;
            length -= 1;
        }

        ArrayList<Mukbang> res = new ArrayList<>();
        while(!heap.isEmpty()) {
            res.add(heap.poll());
        }

        Collections.sort(res, (s1, s2) ->
                s1.getIndex() - s2.getIndex());


        return res.get((k - sum) % length).getIndex();






    }

}
