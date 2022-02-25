package Arrays;

public class DynArray {
    int arr[];
    int ptr = -1;

    DynArray(int size){
        arr = new int[size];
    }

    DynArray(){
        arr = new int[10];
    }

    void insert(int num){
        if(ptr==arr.length-1){
            int tmpArr[] = new int[arr.length*2];
            for(int i=0;i<arr.length;i++) tmpArr[i] = arr[i];
            arr = tmpArr;
            arr[++ptr]= num;
        }
        else{
            arr[++ptr]=num;
        }
    }

    void print(){
        for(int i=0;i<=ptr;i++) {
            if(arr[i]!=-1)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void remove(int idx){
        if(idx>=ptr || idx<0){
            System.out.println("Index out of range");
            return;
        }
        else{
            arr[idx]=-1;
        }
    }

    void removeLast(){
        if(ptr<0){
            System.out.println("Index out of range");
        }
        else{
            arr[ptr--]=-1;
        }
    }
}
