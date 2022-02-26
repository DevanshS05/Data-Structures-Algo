package Queues;

import java.util.LinkedList;

public class QueueWithLinkedList {
    LinkedList<Integer> l = new LinkedList<Integer>();

    void enqueue(int val){
        l.addLast(val);
    }

    int dequeue(){
        return l.removeFirst();
    }

    int peek(){return l.getFirst();}

    int getSize(){
        return l.size();
    }

    boolean isEmpty(){
        if(l.size()==0){
            return true;
        }
        return false;
    }

    void printQueue(){
        System.out.println(l);
    }
}
