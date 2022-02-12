import java.util.*;
public class Stack_reverse_Recursion {
    public static void insertAtBottom(Stack<Integer> s, int item){
        if(s.empty()){
            s.push(item);
            return;
        }
        
        int top = s.pop();
        insertAtBottom(s, item);
        s.push(top);
    }
    
    
    public static void reverseStack(Stack<Integer> s)
    {
        // base case: stack is empty
        if (s.empty()) {
            return;
        }
 
        // Pop all items from the stack and hold them in the call stack
        int item = s.pop();
        reverseStack(s);
 
        // After the recursion unfolds, insert each item in the call stack
        // at the bottom of the stack
        insertAtBottom(s, item);
    }
    
    
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            s.push(i);
        }
 
        System.out.println("Original stack is " + s);
        reverseStack(s);
        System.out.println("Reversed stack is " + s);
    }
}
