public class multiData {
    
    class Node{
        
        String Name; 
        int data;
        Node Next;
        
        public Node(int data, String name){
            this.Name=name;
            this.data=data;
            this.Next=null;
        }
    }
    
    //declare head and link to the object
    public Node head=null;
    public Node link=null;
    
public void add(int data,String Name){
        
        Node newNode= new Node(data,Name);
        
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
    public void searchNode( String value ){
        
        Node current =head;
        int i=1;
        
        boolean flag=false;
        
        if(head==null){
            
            System.out.println("List is empty");
        }
        else{
            
            while(current!=null){
                
                if(current.Name==value){
                    
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
             
             System.out.println(current.data+","+current.Name);

             current=current.Next;
         }
         System.out.println();
     }

     public void sortList() {

        //Node current will point to head  
        Node current = head, index = null;  
        int temp;  
          
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null) {  
                //Node index will point to node next to current  
                index = current.Next;  
                  
                while(index != null) {  
                    //If current node's data is greater than index's node data, swap the data between them  
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                    index = index.Next;  
                }  
                current = current.Next;  
            }      
        }  
    }

     
     
     public static void main(String[] args){
         
        multiData lists=new multiData();
         
         //Adding 1st obj
         lists.add(1,"Rahul");
         lists.display();
         
         //Adding 2nd obj
         lists.add(250,"Pachhi");
         lists.display();
         
         //Adding 3rd obj
         lists.add(400,"Mallesh");
         lists.display();
         
         //Adding 4th obj
         lists.add(980,"Mohan");
         lists.display();

         lists.searchNode("Mallesh");
         
         lists.searchNode("");
         
         lists.searchNode("Rahul");
         
         lists.sortList();

         //Displaying sorted list  
        System.out.println("\n"+"Sorted list: ");  
        lists.display();
     }
    
}
