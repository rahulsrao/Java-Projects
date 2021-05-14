import java.util.*;

public class ListBuiltIn {
   
    public static void main(String args[])
    {
        
        //Declaring Linked list as "List"
        LinkedList<Integer> List= new LinkedList<Integer>();
  
        // Adding elements to the linked list
        List.add(1);
        List.add(10);
        List.addLast(20);
        List.addFirst(300);
        List.add(2, 52);
  
        //Displaying the list elements
        System.out.println(List+"\n");
        
        //Removing  Nodes from the list
        List.remove(2);
        List.remove(3);
        List.removeFirst();
        List.removeLast();
  
        System.out.println(List);
    }
}
