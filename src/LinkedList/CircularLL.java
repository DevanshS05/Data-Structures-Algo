package LinkedList;

public class CircularLL {
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next=null;
        }
        Node(){
            this.val = -1;
            this.next=null;
        }
    }

    Node head,tail;
    int size=0;

    void insertAtHead(int val){
        Node tmp = new Node(val);
        if(head==null){
            head = tmp;
            head.next=head;
            tail = tmp;
        }
        else{
            tail.next = tmp;
            tmp.next = head;
            head = tmp;
        }
        size++;
    }

    void insertAtTail(int val){
        Node tmp = new Node(val);
        if(head==null){
            head = tmp;
            head.next = head;
        }
        else{
            Node t = head;
            tmp.next = head;
            for(int i=1;i<size;i++){
                t = t.next;
            }
            t.next = tmp;
        }
        size++;
    }

    void removeAtTail(){
        Node tmp = head;
        for(int i=1;i<size-1;i++) tmp=tmp.next;
        tmp.next = head;
        tail = tmp;

        size--;
    }

    void removeAtHead(){
        tail.next = head.next;
        head = head.next;
        size--;
    }

    void removeAtPos(int pos){
        if(pos==0){
            removeAtHead();
            return;
        }
        if(pos==size){
            removeAtTail();
            return;
        }
        Node tmp = head;
        for(int i=1;i<size-1;i++) tmp=tmp.next;
        tmp.next = tmp.next.next;
        size--;
    }


    void printList(){
        Node tmp = head;
        for(int i=1;i<=size;i++){
            System.out.print(tmp.val+"-->");
            tmp=tmp.next;
        }
        System.out.println("NULL");
    }

    void getSize(){
        System.out.println("\nThe size of the Circular LL is: "+size);
    }
}
