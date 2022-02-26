package Stacks;

public class Stack {
    private int arr[];
    private int top=-1;
    private int size = 10; //default size of the stack is 10
    private int min_element = Integer.MAX_VALUE;
    private int max_element = Integer.MIN_VALUE;

    Stack(int size){
        arr = new int[size];
        this.size = size;
    }
    Stack(){
        arr = new int[this.size];
    }

    void push(int val){
        if(top==size-1){
            System.out.println("Stack is already full!");
            return;
        }
        this.min_element = Math.min(this.min_element,val);
        this.max_element = Math.max(this.max_element,val);
        arr[++top]=val;
    }

    int peek(){
        if(top==-1){
            System.out.println("Stack is already empty!");
            return -1;
        }
        return arr[top];
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack is already empty!");
            return -1;
        }
        return arr[top--];
    }

    void printStack(){
        if(top==-1){
            System.out.println("Stack is already empty!");
            return;
        }
        for(int i=0;i<=top;i++) System.out.print(arr[i]+" | ");
        System.out.println();
    }

    int getMax(){
        return max_element;
    }
    int getMin(){
        return min_element;
    }
}
