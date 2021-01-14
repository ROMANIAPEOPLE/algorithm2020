//package 코딩테스트.greedy;
//
//import java.util.PriorityQueue;
//
//public class 무지의먹방라이브 {
//
//  public static void main(String[] args) {
//
//
//  }
//  public int solution(int[] food_times, long k) {
//
//    int sum =0;
//    for(int i=0; i<food_times.length; i++){
//      sum += food_times[i];
//    }
//    if(sum <= k) {
//      return -1;
//    }
//
//    sum =0;
//    PriorityQueue<int[]> heap = new PriorityQueue<>();
//    for(int i=0; i<food_times.length; i++){
//      heap.add(new int[]{food_times[i],i+1});
//    }
//
//
//  }
//
//}
