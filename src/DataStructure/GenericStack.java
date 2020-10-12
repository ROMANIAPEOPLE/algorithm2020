package DataStructure;

import java.util.Objects;

public class GenericStack<E> {
    private int stackSize;
    private int ptr;
    private E [] stk;

    public GenericStack(int size) {
        this.stackSize = stackSize;
        this.ptr = -1;
        stk = (E [])new Objects[size];
    }


    public void push(E element) {

        if(stackIsFull()) {
            System.out.println("스택이 가득 찻음");
            IncreaseCapacity();
        }
        stk[++ptr] = element;
    }

    public E pop() throws Exception {

        if(isStackEmpty()) {
            throw new Exception("스택 비어있음");
        }

        return stk[ptr--];
    }

    public E peek(){
        return stk[ptr];
    }


    public boolean isStackEmpty(){
        return ptr == -1;
    }


    public boolean stackIsFull() {
        return this.stackSize-1 == ptr;
    }

    public void IncreaseCapacity() {
         E[] newArr = (E[]) new Object[stackSize*2];

        for(int i=0; i< stackSize; i++){
            newArr[i] = stk[i];
        }
        this.stackSize = stackSize*2;
        this.stk = newArr;

    }



}
