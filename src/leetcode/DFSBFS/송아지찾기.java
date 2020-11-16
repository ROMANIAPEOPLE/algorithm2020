package leetcode.DFSBFS;

/*송아지를 잃어버린 현수는  뒤로1칸, 앞으로 1칸, 앞으로 5칸 이동할 수 있다.
 *현수의 위치와 송아지의 위치가 주어졌을때, 현수가 송아지를 찾는 최소 이동 거리를 구해라.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hyunsu = sc.nextInt();
        int cow =  sc.nextInt();
        System.out.println(bfs(hyunsu,cow));

    }

    private static int bfs(int hyunsu, int cow) {
        int level =0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(hyunsu); // 현수의 초기 위치를 큐에 넣는다.
        while(!queue.isEmpty()) {
            int size =queue.size();

            for(int i=0; i<size; i++){
                int location = queue.poll();
                if(location == cow) {
                    return level;
                }

                queue.offer(location-1);
                queue.offer(location+1);
                queue.offer(location+5);
            }
            level++;
        }
        return 0;
    }


}
