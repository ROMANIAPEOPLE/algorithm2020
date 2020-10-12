package DataStructure;

public class Queue {
    private int queueSize;
    private int front;
    private int rear;
    private int [] q;

    public Queue(int capacity) {
        this.front = -1;
        this.rear = -1;
        this. queueSize= capacity;
        this.q =  new int[queueSize];
    }


    public void add(int value) throws Exception {
        if(isFullQueue()) {
            throw new Exception("큐가 가득참");
        }
        q[++rear] = value;
    }

    public boolean isFullQueue() {
        return this.queueSize-1 == rear;
    }

    public int deQueue() throws Exception {
        if(isEmpty()){
            throw new Exception("큐가 비어있음");
        }

        front = (front+1) % queueSize;
        return q[front];

    }

    public boolean isEmpty(){
        if(front == rear) {
            front = -1;
            rear = -1;
        }

        return front == rear;
    }




}
