public class Delete {
    
   //Represent the head and tail of the doubly linked list  
   Node head, tail = null; 
    
   class Node{  
        
        int data;  
        Node start;  
        Node next;  
  
        public Node(int data) {  
            
            this.data = data;  
        
        }  
    }   
  
    //Add a node to the list  
    public void insertNode(int data) {
        
        //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {
            
        //Both head and tail will point to newNode  
        head = tail = newNode;  
        
        //head's previous will point to null  
        head.start = null;  
        
        //tail's next will point to null, as it is the last node of the list  
        tail.next = null;  
        
        }  
        else {  
           
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            
            //newNode's previous will point to tail  
            newNode.start = tail;  
            
            //newNode will become new tail  
            tail = newNode;  
            
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
  
    //Delete a node from the list  
    public void delete() {  
        
        //Checks whether list is empty  
        if(head == null) {  
            
            return;  
        
        }  
        
        else {
            
            //Checks whether the list contains only one element  
            if(head != tail) {
                
                //head will point to next node in the list  
                head = head.next;
                
                //Previous node to current head will be made null  
                head.start = null;  
            }
            
            //If the list contains only one element it will remove node and now both head and tail will point to null  
            else {
                
                head = tail = null;  
            
            }  
        }  
    }  
  
    //Display the nodes of the list  
    public void display() {
        
        //Node current will point to head  
        Node current = head;  
        
        if(head == null) {  
            
            System.out.println("List is empty");  
            
            return;  
        }  
        while(current != null) {  
            
        //Prints each node by incrementing the pointer.  
        System.out.print(current.data + " ");  
        current = current.next;
        
        }  
        
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        Delete List2 = new Delete();  
        //Add nodes to the list  
        List2.insertNode(100);  
        List2.insertNode(200);  
        List2.insertNode(400);  
        List2.insertNode(800);  
        List2.insertNode(1600);  
  
        //Printing original list  
        System.out.println("The list before deleting: ");  
        List2.display();
        
        
        while(List2.head != null) {  
            List2.delete();
            
            //Printing the updated list  
            System.out.println("\nUpdated List:");
            
            List2.display();  
        }  
    }
    
}
