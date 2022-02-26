package Queues;

public class circularQueue {
    int arr[];
    int last=-1;
    int size=10;

    circularQueue(int size){
        this.size=size;
        arr = new int[size];
    }
    circularQueue(){
        arr=new int[size];
    }

    void enqueue(int val){
        if(last==size-1){
            System.out.println("Queue is already full!");
            return;
        }
        else{
            arr[++last]=val;
        }
    }

    void dequeue(){
        if(last==-1){
            System.out.println("Queue is already empty!");
            return;
        }
        else{
            int newArr[] = new int[this.size];
            for(int i=1;i<=last;i++) newArr[i-1]=arr[i];
            arr = newArr;
            last--;
        }
    }

    int peek(){
        if(last==-1){
            System.out.println("Queue is already full");
            return -1;
        }
        else{
            return arr[last];
        }
    }

    int getElement(int pos){
        if(last==-1){
            System.out.println("Queue is already empty!");
            return -1;
        }
        pos = pos%(last+1);
        return arr[pos];
    }

    void printQueue(){
        for(int i=0;i<=last;i++) System.out.print(arr[i]+"--");
        System.out.println("END");
    }
}
