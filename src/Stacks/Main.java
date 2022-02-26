package Stacks;

public class Main {
    public static void main(String[] args) {
        //Stack s = new Stack();

        /*
        for(int i=1;i<=10;i++) s.push(i);
        s.printStack();

         */

        /*
        //Program to check whether the given string contains balanced parenthesis
        String c = "([{}])";
        //Bracket () -> Stack 1
        //Bracket [] -> Stack 2
        //Bracket {} -> Stack 3
        charStack s1 = new charStack();
        charStack s2 = new charStack();
        charStack s3 = new charStack();

        for(int i=0;i<c.length();i++){
            char ch = c.charAt(i);
            if(ch=='(' || ch==')') {
                if(ch==')' && !s1.isEmpty() && s1.peek()=='('){
                    s1.pop();
                }
                else{
                    s1.push(ch);
                }
            }
            if(ch=='[' || ch==']') {
                if(ch==']' && !s2.isEmpty() && s2.peek()=='['){
                    s2.pop();
                }
                else{
                    s2.push(ch);
                }
            }
            if(ch=='{' || ch=='}') {
                if(ch=='}' && !s3.isEmpty() && s3.peek()=='{'){
                    s3.pop();
                }
                else{
                    s3.push(ch);
                }
            }
        }

        if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty()){
            System.out.println("The expression contains balanced parenthesis");
        }
        else{
            System.out.println("The expression does not contains balanced parenthesis");
        }

        //Program to reverse a string
        String myString = "This is something other than hello world.";
        charStack S = new charStack(myString.length());
        for(int i=0;i<myString.length()-1;i++) S.push(myString.charAt(i));
        String revString="";
        for(int i=0;i<myString.length()-1;i++){
            revString+=Character.toString(S.pop());
        }
        revString+=".";
        System.out.println("Original string is: "+myString);
        System.out.println("\nThe reversed string is: "+revString);
        */

        DoubleStack s = new DoubleStack();
        for(int i=1;i<=25;i++){
            if(i<=13)
                s.pushOne(i);
            else
                s.pushTwo(i);
        }

        s.printStackOne();
        s.printStackTwo();
        System.out.println("Popping from each stack once: "+s.popOne()+" "+s.popTwo());
        System.out.println("Peeking into each stack once: "+s.peekOne()+" "+s.peekTwo());
    }
}
