package Arrays;

public class Main {
    public static void main(String[] args) {
        //Array a = new Array(10);

        /*
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
         */

        /*
        DynArray da = new DynArray();
        for(int i=0;i<35;i++){
            da.insert(i*10);
        }

        da.print();

        for(int i=0;i<10;i++) da.removeLast();

        System.out.println();

        da.print();
         */

        Array a1 = new Array(10);
        Array a2 = new Array(7);

        for(int i=1;i<=10;i++) a1.insert(i);
        for(int i=1;i<=7;i++) a2.insert(i);

        a1.intersection(a2);

        a2.reverse();
        a2.print();
        System.out.print("Max element is arr1 is: "+a1.arrMax());
    }
}