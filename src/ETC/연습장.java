package ETC;


import java.util.PriorityQueue;

class Food implements Comparable<Food> {

  int time;
  int index;

  public Food(int time, int index) {
    this.time = time;
    this.index = index;
  }
  public int getTime(){
      return time;
  }
  public int getIndex() {
      return index;
  }

    @Override
    public int compareTo(Food f) {
        return this.time-f.time;
    }
}

public class 연습장 {

  public static void main(String[] args) {

    PriorityQueue<Food> queue = new PriorityQueue<>();

    queue.offer(new Food(1, 3));
    queue.offer(new Food(3, 2));
    queue.offer(new Food(2, 5));

    System.out.println(queue.poll().time);

  }
}
