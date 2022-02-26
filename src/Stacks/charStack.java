package Stacks;

public class charStack {
    char arr[];
    int top=-1;
    int size = 10; //default size of the stack is 10

    charStack(int size){
        arr = new char[size];
        this.size = size;
    }
    charStack(){
        arr = new char[this.size];
    }

    void push(char val){
        if(top==size-1){
            System.out.println("Stack is already full!");
            return;
        }
        arr[++top]=val;
    }

    char peek(){
        if(top==-1){
            System.out.println("Stack is already empty!");
            return ' ';
        }
        return arr[top];
    }

    char pop(){
        if(top==-1){
            System.out.println("Stack is already empty!");
            return ' ';
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

    boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }

    int getSize(){
        return top+1;
    }
}
