package LinkedList;

public class kthNodeFromEnd {
    public static void main(String[] args) {
        SinglyLL l = new SinglyLL();

        for(int i=1;i<=5;i++) l.insertAtHead(i);

        int size = l.getSize();
        int reqNodeFromEnd = 3; // The node that is required from the end
        int node = size-reqNodeFromEnd;
        l.print();
        System.out.println(l.getElement(node));
    }
}
