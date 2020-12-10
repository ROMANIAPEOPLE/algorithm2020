package 코딩테스트.최단경로;

import java.util.ArrayList;

class Node {
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return this.index;
    }

    public int getDistance() {
        return this.distance;
    }
}


public class Dijkstra {

    public static final int INF = (int) 1e9; // 무한 의미 : 10억
    //노드의 개수(N) , 간선의 개수(M), 시작 노드 번호(start)
    //노드의 개수는 최대 100,000개
    public static int n, m, start;
    //각 노드에 연결되어 있는 노드에 대한 정보를 담는 배열
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    //방문 여부 check 배열
    public static boolean [] visited = new boolean[100001];
    //최단 거리 테이블 만들기
    public static int [] d = new int[100001];

    //방문하지 않는 노드 중에서, 가장 최단 거리가 짧은 노드의 번호를 반환
    public static int getSmallestNode() {
        int min_value = INF;
        int index = 0;
        for(int i = 1; i<=n; i++) {
            if(d[i] < min_value && !visited[i]) {
                min_value = d[i];
                index = i;
            }
        }
        return index;
    }

    public static void dijkstra(int start) {
        d[start] = 0;
        visited[start] = true; //방문 완료.
        for(int j=0; j< graph.get(start).size(); j++) {
            
        }
    }


}
