public class DeleteFromStart 
{
    Node head, tail = null;

    class Node
    {
        int data;
        Node start;
        Node next;
        public Node(int data)
        {
            this.data= data;
        }
    }

    public void insertNode(int data)
    {
        Node newNode = new Node(data);

        if(head == null )
        {
            head =tail =newNode;
            head.start = null;
            tail.next = null;
        }
        else
        {
            tail.next = newNode;
            newNode.start =tail;
            tail = newNode;
            tail.next =null;
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
            
                head = head.next;
                head.start = null;

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
    
    public static void main(String[] args) {  
  
        DeleteFromStart List = new DeleteFromStart(); 
        List.insertNode(100);  
        List.insertNode(200);  
        List.insertNode(400);  
        List.insertNode(800);  
        List.insertNode(1600);

        System.out.println("The list before deleting: ");  
        List.display();
        
        while(List.head != null)
        {  
            List.delete();
            System.out.println("\nUpdated List:");
            List.display();  
        }  
    }

}
