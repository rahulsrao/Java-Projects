
public class DeleteFromBign {
   
    class Node{
        
        int data;
        Node next;
       
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    //declare head and link to the object
    public Node head=null;
    public Node link=null;
    
    //to add a node to the list
    public void add(int data){
        
        Node newNode= new Node(data);
        
        //Verify whether list is empty
        if(head == null){
            
            head=newNode;
            link=newNode;
        }
        else{
            
            link.next=newNode;
            link=newNode;
            
        }
    }
    
    //Delete node from the beginning
    
    public void delete(){
        
        if(head==null){
            
            System.out.println("List is empty");
            return;
        }
        else{
            
            if(head!=link){
                head=head.next;
            }
            else{
                head=link=null;
            }
        }
        
    }
    public void display(){
        
        Node current=head;
        if(head==null){
            
            System.out.println("List is Empty");
            return;
        }
        while(current!=null){
            
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();

    }
    
    public static void main(String[] args){
        
        DeleteFromBign ListSt=new DeleteFromBign();
        
        //Insert data
        ListSt.add(1);
        ListSt.add(2);
        ListSt.add(3);
        ListSt.add(4);
        
        //Print List
        System.out.println("Origin list:");
        ListSt.display();
        
        while(ListSt.head != null){
            
            ListSt.delete();
            
            //Print List
            System.out.println("Updated list:");
            ListSt.display();
            
        }
    }
    
}
