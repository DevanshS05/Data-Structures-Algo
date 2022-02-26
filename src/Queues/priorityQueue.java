package Queues;

public class priorityQueue {
    int arr[];
    int size=10;
    int last=-1;

    priorityQueue(){
        arr = new int[this.size];
    }

    priorityQueue(int size){
        this.size=size;
        arr = new int[this.size];
    }

    void enqueue(int val){
        if(last==-1){
            arr[++last]=val;
            return;
        }
        if(last==size-1){
            System.out.println("Queue is already full!");
            return;
        }
        else{
            int i=0;
            while(i<this.last && arr[i]<val){
                i++;
            }

            int newArr[] = new int[size];
            for(int j=0;j<=i;j++){
                newArr[j] = arr[j];
            }
            newArr[i+1]=val;
            for(int j=i+2;j<=last;j++){
                newArr[j]=arr[j-2];
            }

            arr=newArr;
            last++;
        }

    }

    void dequeue(){
        int newArr[] = new int[this.size];
        for(int i=1;i<=this.last;i++){
            newArr[i]=arr[i-1];
        }
        last--;
    }

    void printQueue(){
        if(last==-1){
            System.out.println("Queue is already empty!");
            return;
        }
        else{
            for(int i=0;i<=last;i++) System.out.print(arr[i]+"--");
            System.out.println("END");
        }
    }
}
