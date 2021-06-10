public class Stack {
 
    private int arr[];
    private int top;
    private int capacity;
 
    //initializing the stack
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
 
    // add an element `x` to the stack
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\n");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
 
    //pop a top element from the stack
    public int pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow\n");
            System.exit(1);
        }
 
        System.out.println("Removing " +peek());
 
        //decrease stack size by 1
        return arr[top--];
    }
 
    //return the top element of the stack
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(1);
        }
        return -1;
    }
 
    //return the size of the stack
    public int size() {
        return top + 1;
    }
 
    //check if the stack is empty or not
    public Boolean isEmpty()
    {
        //return size()==0 or 1 ;
        return top == -1;
    }
 
    //check if the stack is full or not
    public Boolean isFull() {
        
        //return size() == capacity or capacity-1;
        return top == capacity - 1;
    }
}
 
class Main
{
    public static void main (String[] args)
    {
        //Declaring Stack
        Stack stack = new Stack(3);
        
        //Innserting elements
        stack.push(1);
        stack.push(2);
        
        // removing top element
        stack.pop();
        stack.pop();
 
        // inserting 3rd element to the stack
        stack.push(3);
 
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
 
        // removing the top element
        stack.pop();
 
        // check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
    
}