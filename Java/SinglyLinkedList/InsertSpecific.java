

public class InsertSpecific {
    
    static class Node{
        
        public int data;
        public Node NewNode;
        
        //insert the data
        
        public Node(int data){
            this.data=data;
        }
    }
    
    //Create and return node
    static Node AddNode(int data){
        
        return new Node(data);
        
 }
    
    static Node InserPos(Node headN,int Pos,int data){
        
        Node head=headN;
        
        if(Pos<1){
            System.out.println("Invaloid Position");
        }
        
        if(Pos==1){
            
            Node newNode=new Node(data);
            newNode.NewNode=headN;
            head=newNode;
        }
        else{
            while(Pos-- !=0){
                if(Pos==1){
                    Node newNode =AddNode(data);
                    
                    newNode.NewNode=headN.NewNode;
                    
                    headN.NewNode=newNode;
                    break;
                }
                headN=headN.NewNode;
            }
            if(Pos!=1){
                System.out.println("Out of range");
            }
        }
        return head;
    }
   
    static void display(Node node){
        
        while(node!=null){
            System.out.println(node.data);
            node=node.NewNode;
            if(node!=null){
                System.out.println(" ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        
        Node head  = AddNode(100);
        head.NewNode = AddNode(200);
        head.NewNode.NewNode=AddNode(300);
        head.NewNode.NewNode.NewNode=AddNode(400);
        
        System.out.println("List before insertion: ");
        
        display(head);
        
        int data=250,pos=3;
        
        head=InserPos(head,pos,data);
        
        System.out.println("List after insertion of 150 at 2:");
        
        display(head);
        
        
        data=50;pos=1;
        
        head=InserPos(head,pos,data);
        
        System.out.println("List after insertion of 230 at 1:");
        
        display(head);
        
        
        data=750;pos=7;
       
        head=InserPos(head,pos,data);
        
        System.out.println("List after insertion of 620 at 5:");
        
        display(head);
    }
    
}
