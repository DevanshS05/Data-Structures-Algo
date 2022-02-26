package Stacks;

public class DoubleStack {
    int arr[];
    int top1;
    int top2;
    int size1 = 10; //Default size is 10
    int size2 = 10; //Default size is 10

    DoubleStack(int size1,int size2){
        this.size1 = size1;
        this.size2 = size2;
        this.arr = new int[size1+size2];
        this.top1=-1;
        this.top2=size1-1;
    }

    DoubleStack(){
        this.arr = new int[size1+size2];
        this.top1=-1;
        this.top2=size1-1;
    }

    void pushOne(int val){
        if(top1==size1-1){
            System.out.println("Stack One is already full!");
            return;
        }
        arr[++top1]=val;
    }

    void pushTwo(int val){
        if(top2==size1+size2-1){
            System.out.println("Stack Two is already full!");
            return;
        }
        arr[++top2]=val;
    }

    int popOne(){
        if(top1==-1){
            System.out.println("Stack One is already empty!");
            return -1;
        }
        else{
            return arr[top1--];
        }
    }

    int popTwo(){
        if(top2==size1-1){
            System.out.println("Stack Two is already empty!");
            return -1;
        }
        else{
            return arr[top2--];
        }
    }

    int peekOne(){
        if(top1==-1){
            System.out.println("Stack One is already empty!");
            return -1;
        }
        else{
            return arr[top1];
        }
    }

    int peekTwo(){
        if(top2==size1-1){
            System.out.println("Stack Two is already empty!");
            return -1;
        }
        else{
            return arr[top2];
        }
    }

    void printStackOne(){
        if(top1==-1){
            System.out.println("Stack 1 is empty");
            return;
        }
        else{
            for(int i=0;i<=top1;i++) System.out.print(arr[i]+" | ");
            System.out.println();
        }
    }

    void printStackTwo(){
        if(top2==-1){
            System.out.println("Stack 2 is empty");
            return;
        }
        else{
            for(int i=size1;i<=top2;i++) System.out.print(arr[i]+" | ");
            System.out.println();
        }
    }
}
