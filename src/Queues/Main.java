package Queues;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        for(int i=10;i<=15;i++) q.enqueue(i);
        //q.dequeue();
        q.printQueue();
    }
}
