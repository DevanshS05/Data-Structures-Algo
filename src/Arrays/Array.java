package Arrays;

public class Array {
    int arr[];
    int ptr = -1;
    Array(int size){
        arr = new int[size];
    }

    void print(){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }

    void insert(int num){
        if(ptr>=arr.length-1){
            System.out.println("The array is already full!");
            return;
        }
        else{
            arr[++ptr] = num;
        }
    }

    void fetch(int idx){
        if(idx>ptr || idx<0) {
            System.out.println("Index out of range!");
            return;
        }
        else{
            System.out.println("Element at index "+idx+" is: "+arr[idx]);
        }
    }

    void remove(int idx){
        if(idx>ptr || idx<0) {
            System.out.println("Index out of range!");
            return;
        }
        else{
            //int num = arr[idx];
            arr[idx] = -1;
            System.out.println("Element at index "+idx+" is removed");
        }
    }
}