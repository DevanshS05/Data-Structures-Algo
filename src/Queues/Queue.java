package Queues;

public class Queue {
    int arr[];
    int last=-1;
    int size=10;

    Queue(int size){
        this.size=size;
        arr = new int[size];
    }
    Queue(){
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

    void printQueue(){
        for(int i=0;i<=last;i++) System.out.print(arr[i]+"--");
        System.out.println("END");
    }

    void reverseQueue(){
        /*
        //Method 1: Takes O(n) space
        int newArr[] = new int[size];
        for(int i=0;i<=last;i++){
            newArr[i] = arr[last-i];
        }
        arr = newArr;

         */
        //Method 2: Takes O(1) constant space
        for(int i=0;i<=last/2;i++){
            int tmp = arr[i];
            arr[i] = arr[last-i];
            arr[last-i]=tmp;
        }
    }

    void reverseQueueUptoK(int pos){
        pos--;
        for(int i=0;i<=pos/2;i++){
            int tmp  = arr[i];
            arr[i] = arr[pos-i];
            arr[pos-i]=tmp;
        }
    }
}
