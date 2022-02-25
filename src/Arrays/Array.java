package Arrays;

public class Array {
    int arr[];
    int ptr = -1;
    Array(int size){
        arr = new int[size];
    }
    Array(){
        arr = new int[10];
    }

    void print(){
        for(int i=0;i<=ptr;i++) System.out.print(arr[i]+" ");
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

    int arrMax(){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=ptr;i++)
            if(arr[i]>max)
                max=arr[i];

        return max;
    }

    void intersection(Array a2){
        int l1 = ptr;
        int l2 = a2.ptr;

        int minL = Math.min(l1,l2);

        for(int i=0;i<=minL;i++){
          if(arr[i]==a2.arr[i]){
              System.out.println("Insersecting Element: "+arr[i]);
          }
        }
    }

    void reverse(){
        for(int i=0;i<=ptr/2;i++){
            int tmp = arr[i];
            arr[i] = arr[ptr-i];
            arr[ptr-i]=tmp;
        }
    }
}