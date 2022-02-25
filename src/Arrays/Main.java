package Arrays;

public class Main {
    public static void main(String[] args) {
        Array a = new Array(10);

        //Inserting the 10 elements into the array
        for(int i=1;i<=10;i++){
            a.insert(i);
        }

        //Printing the array using the print function
        a.print();

        System.out.println();

        //Printing the array using the fetch method
        for(int i=0;i<10;i++){
            a.fetch(i);
        }

        //Removing all the elements in the array
        for(int i=0;i<10;i++) a.remove(i);

        System.out.println();
        //All the elements are supposed to be -1
        a.print();
    }
}