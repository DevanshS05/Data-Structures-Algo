package LinkedList;

public class SinglyLL {

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }

        Node(){
            this.val=-1;
            this.next=null;
        }
    }

    int size = 0;
    Node head;

    SinglyLL(){
        System.out.println("Linked List has been created");
    }

    void insertAtHead(int val){
        if(head==null){
            Node tmp = new Node(val);
            head = tmp;
        }
        else{
            Node tmp = new Node(val);
            tmp.next = head;
            head = tmp;
        }
        size++;
    }

    void insertAtTail(int val){
        Node tmp = new Node(val);
        if(head==null){
            head = tmp;
        }else{
            Node t = head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=tmp;
        }
        size++;
    }

    void deleteAtTail(){
        Node tmp = head;
        while(tmp.next.next!=null){
            tmp = tmp.next;
        }
        tmp.next = null;
        size--;
    }

    void deleteAtHead(){
        head = head.next;
        size--;
    }

    void insertAtPos(int pos,int val){
        Node tmp = head;

        if(pos==0){
            insertAtHead(val);
            return;
        }

        for(int i=0;i<pos-1;i++) tmp=tmp.next;
        Node t = new Node(val);
        t.next = tmp.next;
        tmp.next = t;

        size++;
    }

    void deleteAtPos(int pos){
        Node tmp = head;
        for(int i=1;i<pos-1;i++) tmp = tmp.next;
        tmp.next = tmp.next.next;

        size--;
    }

    int getElement(int pos){
        Node tmp = head;
        for(int i=0;i<pos-1;i++){
            tmp=tmp.next;
        }
        return tmp.val;
    }

    void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(tmp.val+"-->");
            tmp=tmp.next;
        }
        System.out.println("Tail");
    }

    int getSize(){
        //System.out.println("The current size of the Linked List is:"+size);
        return size;
    }

    void reverseList(){
        Node prev = null;
        Node current = head;
        Node next;
        while(current!=null){
            //System.out.print(current.val+" ");
            next = current.next;
            current.next = prev;
            prev= current;
            current = next;
        }
        head = prev;
    }

}
