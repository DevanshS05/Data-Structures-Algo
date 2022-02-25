package LinkedList;

public class DoublyLL {
    class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
            this.next = this.prev = null;
        }

        Node(){
            this.val=-1;
            this.next=this.prev=null;
        }
    }

    Node head;
    Node tail;
    int size=0;

    void insertAtHead(int val){
        Node tmp = new Node(val);
        if(head==null){
            head=tmp;
            tail = tmp;
            head.prev = null;
            return;
        }
        else{
            tmp.next = head;
            head.prev = tmp;
            head = tmp;
        }
        size++;
    }

    void insertAtTail(int val){
        Node tmp = new Node(val);
        if(head==null){
            head=tmp;
            tail = tmp;
            head.prev = null;
            return;
        }
        else{
            tail.next = tmp;
            tmp.prev = tail;
            //tmp.next = null;
            tail = tmp;
        }
        size++;
    }

    void deleteAtHead(){
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail(){
        tail = tail.prev;
        tail.next=null;
        size--;
    }

    void insertAtPos(int pos,int val){
        Node tmp = new Node(val);
        if(pos==0){
            insertAtHead(val);
            return;
        }
        if(pos==size){
            insertAtTail(val);
            return;
        }
        Node t = head;
        for(int i=1;i<pos-1;i++) t = t.next;
        tmp.next = t.next;
        tmp.prev = t;
        t.next.prev = tmp;
        t.next = tmp;

        size++;
    }

    void deleteAtPos(int pos){
        Node tmp = head;
        if(pos==0){
            deleteAtHead();
            return;
        }
        if(pos==size){
            deleteAtTail();
            return;
        }
        for(int i=1;i<pos-1;i++) tmp = tmp.next;
        tmp.next = tmp.next.next;
        tmp.next.next.prev = tmp;
        size--;
    }

    void print(){
        Node tmp = head;
        System.out.println("\nPrinting in forward direction\n");
        System.out.print("HEAD-->");
        while(tmp.next!=null){
            System.out.print(tmp.val+"-->");
            tmp=tmp.next;
        }
        System.out.print(tmp.val);
        System.out.print("TAIL;");
        System.out.println("\nPrinting in the backward direction\n");
        System.out.print("TAIL-->");
        while(tmp!=null){
            System.out.print(tmp.val+"-->");
            tmp=tmp.prev;
        }
        System.out.print("HEAD\n");
    }
}
