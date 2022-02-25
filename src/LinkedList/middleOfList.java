package LinkedList;

public class middleOfList {
    public static void main(String[] args) {
        SinglyLL l = new SinglyLL();
        SinglyLL l2 = new SinglyLL();
        //List containing even number of elements
        for(int i=1;i<=10;i++) l.insertAtHead(i);
        l.print();
        System.out.println();
        l.middleOfList();

        //List containing odd numbers of elements
        for(int i=1;i<10;i++) l2.insertAtTail(i);
        l2.print();
        System.out.println();
        l2.middleOfList();
    }
}
