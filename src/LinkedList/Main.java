package LinkedList;

public class Main {
    public static void main(String[] args) {
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
    }
}
