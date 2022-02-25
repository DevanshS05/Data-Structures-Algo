package LinkedList;

public class reverseLinkedList {
    public static void main(String[] args) {
        SinglyLL l = new SinglyLL();
        for(int i=1;i<=5;i++) l.insertAtHead(i); //Inserting the elements into the list

        /*
        //Method 1: Use O(n) extra space to reverse the list
        SinglyLL revl = new SinglyLL();

        for(int i=1;i<= l.getSize();i++)
            revl.insertAtHead(l.getElement(i));

        l.print(); //Printing the original List
        revl.print(); //Printing the reversed Linked List
         */

        //Method 2: In-place reversal of the linked list
        //(Method needed element-wise access hence it is defined in the class SinglyLL itself)
        l.print(); //Original List
        l.reverseList();
        l.print(); //Reversed List
    }
}
