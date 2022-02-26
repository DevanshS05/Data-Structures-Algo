package LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        SinglyLL ll = new SinglyLL();

        //for(int i=0;i<5;i++) ll.insertAtHead(i);
        for(int i=0;i<5;i++) ll.insertAtTail(i);
        ll.insertAtPos(3,69);
        ll.insertAtPos(0,96);

        ll.deleteAtHead();
        ll.deleteAtTail();
        ll.deleteAtPos(3);
        ll.print();
        ll.getSize();

         */

        /*
        DoublyLL l = new DoublyLL();
        for(int i=1;i<=5;i++) l.insertAtHead(i);
        l.insertAtTail(69);
        l.insertAtTail(23);
        l.deleteAtTail();
        l.deleteAtHead();
        l.insertAtPos(3,33);
        l.deleteAtPos(3);
        l.print();

         */

        CircularLL l = new CircularLL();
        for(int i=1;i<=5;i++) l.insertAtHead(i);
        l.printList();
    }
}
