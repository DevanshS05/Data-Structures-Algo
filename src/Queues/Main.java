package Queues;

public class Main {
    public static void main(String[] args) {

        /*
        Queue q = new Queue(10);
        for(int i=10;i<=15;i++) q.enqueue(i);
        //q.dequeue();
        q.printQueue();
        q.reverseQueueUptoK(3);
        q.printQueue();
         */

        /*
        StackWithTwoQueues s = new StackWithTwoQueues();
        for(int i=1;i<=15;i++) s.enqueue(i);
        s.dequeue();
        s.dequeue();
        s.dequeue();
        s.dequeue();
        s.dequeue();
        s.printQueue();
        */

        /*
        priorityQueue q = new priorityQueue(50);
        for(int i=1;i<=37;i++) q.enqueue(i);
        for(int i=0;i<5;i++) q.dequeue();
        q.printQueue();

         */

        QueueWithLinkedList queue = new QueueWithLinkedList();
        for(int i=1;i<=10;i++) queue.enqueue(i);
        queue.dequeue();

        queue.printQueue();
    }
}
