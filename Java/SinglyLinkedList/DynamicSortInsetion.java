public class DynamicSortInsetion {
    
    //declare head and link to the object
    public Node head=null;
    public Node link=null;
    class Node{
        int data;
        Node Next;   
        public Node(int data){    
            this.data=data;
            this.Next=null;
        }
    }

    public void Add(int data){
    Node newNode= new Node(data);
    if(head==null){
    head=newNode;
    link=newNode;
    }
    else{
    Node temp=head;
    head=newNode;
    head.Next=temp;
    Node current = head, index = null;  
    int temps;
    while(current != null) {   
        index = current.Next;  
        while(index != null) {
        if(current.data > index.data) {  
        temps = current.data;  
        current.data = index.data;  
        index.data = temps;  
        }  
        index = index.Next;  
        }  
        current = current.Next;  
        } 
    }
     
    }

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
         
        DynamicSortInsetion lists=new DynamicSortInsetion();
        lists.Add(200);
        lists.display();

        lists.Add(100);
        lists.display();

        lists.Add(20);
        lists.display();

        lists.Add(500);
        lists.display();
     }
}
