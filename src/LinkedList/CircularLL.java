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

    Node head;
    int size=0;

    void insertAtHead(int val){
        Node tmp = new Node(val);
        if(head==null){
            head = tmp;
            head.next = head;
        }
        else{
            tmp.next = head;
            head = tmp;
        }
        size++;
    }

    void printList(){
        Node tmp = head;
        for(int i=1;i<=size;i++){
            System.out.print(tmp.val+" ");
            tmp=tmp.next;
        }
    }
}
