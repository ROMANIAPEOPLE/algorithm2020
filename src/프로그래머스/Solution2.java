package 프로그래머스;//다리를 지나는 트럭

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Truck{
    int bridge_length; // 다리의 거리이자 트럭이 지나야하는 거리
    int bridge_weight; // 다리의 무게

    public Truck(int bridge_length , int bridge_weight) {
        this.bridge_length = bridge_length;
        this.bridge_weight = bridge_weight;
    }

}
public class Solution2 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        int time=0;
        Queue<Truck> waitTruck = new LinkedList<>();
        List<Truck> inBridge = new ArrayList<>();


        for (int truck_weight : truck_weights) {
            waitTruck.add(new Truck(bridge_length, truck_weight));
        }

        int left_weight = weight;

        while(!(waitTruck.isEmpty() && inBridge.isEmpty())) {
            time++;

            if(!inBridge.isEmpty() && inBridge.get(0).bridge_length == 0) {
              left_weight += inBridge.get(0).bridge_weight;
              inBridge.remove(0);
            }

            if(!waitTruck.isEmpty() && left_weight >=  waitTruck.peek().bridge_weight) {
                left_weight -= waitTruck.peek().bridge_weight;
                inBridge.add(waitTruck.poll());
            }

            for(int index =0 ; index < inBridge.size(); index++) {
                inBridge.get(index).bridge_length--;
            }
        }

        return time;

    }

    public static void main(String[] args) {
        int [] arr = {10,10,10,10,10,10,10,10,10,10};


        System.out.println(solution(100,100,arr));

    }
}
