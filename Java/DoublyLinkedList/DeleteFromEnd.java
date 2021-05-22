public class DeleteFromEnd 
{    
   Node head, tail = null;    
   class Node
   {      
        int data;  
        Node start;  
        Node next;  
        public Node(int data) 
        {      
            this.data = data;  
        }  
    }   
  
    public void insertNode(int data)
    {
        
        Node newNode = new Node(data);  
  
        if(head == null) 
        {     
            head = tail = newNode;  
            head.start = null;  
            tail.next = null;  
        }  
        else 
        {  
            tail.next = newNode;  
            newNode.start = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  
  
    public void delete() 
    {  
        if(head == null)
        {  
            return;  
        }  
        else 
        {  
            if(head != tail) 
            {  
                tail = tail.start;  
                tail.next = null;  
            }  
            
            else 
            {  
                head = tail = null;  
            }  
        } 
    } 
  
    public void display() 
    {    
        Node current = head;  
        if(head == null) 
        {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) 
        {  
            System.out.print(current.data + " ");  
            current = current.next;
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) 
    {  
  
        DeleteFromEnd List2 = new DeleteFromEnd();

        List2.insertNode(100);  
        List2.insertNode(200);  
        List2.insertNode(400);  
        List2.insertNode(800);  
        List2.insertNode(1600);  
  
        System.out.println("The list before deleting: ");  
        List2.display();

        while(List2.head != null) 
        {  
            List2.delete();
            System.out.println("\nUpdated List:");
            List2.display();  
        }  
    }
    
}
