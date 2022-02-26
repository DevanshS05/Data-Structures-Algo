package Hash_Tables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Program to find the first character which does not repeat
        int val[] = new int[26];

        for(int i=0;i<26;i++) val[i]=0;

        String s = "green";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>=97 && ch<=122)
                //System.out.println(ch);
                val[(int)ch-97]++;
        }

        for(int i=0;i<26;i++){
            //System.out.println(+" "+val[i]);
            if(val[i]==1) {
                System.out.println((char) (i + 97));
                break;
            }
        }
    }
}
