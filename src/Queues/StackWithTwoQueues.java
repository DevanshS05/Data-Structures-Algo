package Queues;

import java.util.Stack;

public class StackWithTwoQueues {
    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();

    void enqueue(int val){
        s1.push(val);
    }

    int dequeue(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }

        if(s2.isEmpty()){
            int n=s1.size();
            for(int i=0;i<n;i++){
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    void printQueue(){
        for(int i=0;i<s1.size();i++){
            s2.push(s1.pop());
        }
        System.out.println(s2);
    }

    void printStackOne(){
        System.out.println(s1);
    }
    void printStackTwo(){
        System.out.println(s2);
    }
}
