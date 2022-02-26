package Stacks;

public class Stack {
    int arr[];
    int top=-1;
    int size = 10; //default size of the stack is 10

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
}
