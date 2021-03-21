package 코드구현력기르기;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
필요한 회의실의 개수 구하기
 */
class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}


public class 미팅룸 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Interval[] intervals = new Interval[n];

        //1. 입력 받기
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            intervals[i] = new Interval(start, end);
        }

        //2. 회의 시작 시간 기준 오름차순으로 정렬
        Arrays.sort(intervals, (s1, s2) -> s1.start - s2.start);

        Queue<Interval> heap = new PriorityQueue<>(intervals.length, (e1, e2) -> e1.end - e2.end);

        heap.offer(intervals[0]);

        for(int i=1; i<intervals.length; i++) {

            if(heap.peek().end <= intervals[i].start) {
                heap.poll();
            }

            heap.offer(intervals[i]);
        }

        System.out.println(heap.size());

    }

    public static void print(Interval[] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            System.out.println(intervals[i].start + " / " + intervals[i].end);
        }
    }


}
