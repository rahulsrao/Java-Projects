public class InsertAndCount {
 
    
    //Declaration of head and tail of Node
    Node head,tail=null;
    
    
    class Node{
        
        int data;
        Node start;
        Node next;
        
        public Node(int data){
            
            this.data=data;
        }
    }
    
    //Adding node into the list
    
    public void insertNode(int data){
        
        //Create a new Node
        Node newNode= new Node(data);
        
        //If list is empty 
        if(head==null){
            
            //Both head and tail will poitn newNode
            head=tail=newNode;
            
            //head's previous will point to null  
            head.start = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
            
        }
        else{
            
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
    
    //For gettind count of Nodes present in the list
    public int countNodes(){  
        
        int count=0;  
        
        //current Node will point to head  
        Node CNode= head;  
  
        while(CNode != null) {  
        
        //Increment the counter by 1 for each node  
        count++;  
        CNode = CNode.next;  
        }  
        return count;  
    }  
    
    //For Displaying the Elements with data
    
    public void display(){
        
        // Node current will point to head
        Node current =head;
        
        if(head== null){
            
            System.out.println("List is empty");
            return;
        }
        
        System.out.println("Listing the elements present in the list \n");
        
        while(current!=null){
            
            //Printing each node by incrementing the pointer
            System.out.print(current.data+" ");
            
            current=current.next;
            
        }
    }
    
    public static void main(String[] args){
        
        InsertAndCount List1=new InsertAndCount();
        
        //Adding nodes to the list
        List1.insertNode(250);
        List1.insertNode(500);
        List1.insertNode(750);
        List1.insertNode(100);
        List1.insertNode(1250);
        List1.insertNode(1500);
    
        //Displayig nodes present in the list
        List1.display();
        
        //Getting count of nodes and printing the count
        System.out.println("\n \nCount of nodes present in the list:"+ List1.countNodes());
    
    }
}
