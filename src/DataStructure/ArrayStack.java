package DataStructure;

public class ArrayStack {
    int stackSize; // 스택의 총 크기
    int [] arr; // 스택
    int top; // 스택의 현재 위치

    public ArrayStack(int stackSize) {
        this.stackSize = stackSize;
        this.top = -1;
        this.arr = new int[stackSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return this.stackSize-1 == top;
    }

    public void push( int value) {
        if(isFull()) {
            System.out.println("스택이 가득참");
            return;
        }
        arr[++top] = value;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("스택이 비어있음");
        }
        return arr[top--];
    }

    public int peek () {
        return arr[top];
    }




}
