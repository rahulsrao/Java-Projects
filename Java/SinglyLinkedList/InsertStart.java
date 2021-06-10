
public class InsertStart {
    
    class Node{
        int data;
        Node Next;
        
        public Node(int data){
            
            this.data=data;
            this.Next=null;
        }
    }
    
    //declare head and link to the object
    public Node head=null;
    public Node link=null;
    
public void add(int data){
        
        Node newNode= new Node(data);
        
        //Verify whether list is empty
        if(head==null){
            
            head=newNode;
            link=newNode;
            
        }
        
        else{
            
            Node temp=head;
            
            head=newNode;
            
            head.Next=temp;
        }
    }
    public void seachNode(int data){
        
        Node current =head;
        int i=1;
        
        boolean flag=false;
        
        if(head==null){
            
            System.out.println("List is empty");
        }
        else{
            
            while(current!=null){
                
                if(current.data==data){
                    
                    flag=true;
                    break;
                }
                i++;
                current=current.Next;
            }
        }
        
        if(flag){
            
            System.out.println("Element is present at position "+i);
        }
        else{
            
            System.out.println("Element is not present in the list");
        }
    }    
    
    
     //Display all nodes present in list
     public void display(){
         
         Node current=head;
         
         if(head==null){
             
             System.out.println("List is empty");
             return;
         }
         
         System.out.println("Adding nodes to list");
         
         while(current!=null){
             
             System.out.println(current.data+" ");
             current=current.Next;
         }
         System.out.println();
     }
     
     public static void main(String[] args){
         
         InsertStart lists=new InsertStart();
         
         //Adding 1st obj
         lists.add(100);
         lists.display();
         
         //Adding 2nd obj
         lists.add(250);
         lists.display();
         
         //Adding 3rd obj
         lists.add(400);
         lists.display();
         
         //Adding 4th obj
         lists.add(980);
         lists.display();
         
         
         lists.seachNode(980);
         
         lists.seachNode(0);
         
         lists.seachNode(400);
         
     }
}
