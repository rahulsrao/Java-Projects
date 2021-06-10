import java.util.Stack;

public class Stack1 {
    
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();

        //Add Elements into Stack
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
 
        System.out.println("The top element is " + stack.peek());
 
        //Remove elements from Stack
        stack.pop();
        stack.pop();
 
        //Get total number of elements present in the stack
        System.out.println("The stack size is " + stack.size());
 
        // check if the stack is empty
        if (stack.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
            System.out.println("The elemenst present are");
        for (int i=0;i<=stack.size()-1;i++)
        {
            System.out.println(stack.get(i));
        }
        }
    }
}
