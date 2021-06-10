public class SimpleSinglyLikedList {
    
    Node head;
    
    static class Node{
        
        int data;
        Node link;
        Node(int a){
            
            data=a;
            link=null;
        }
    }
    
    public void display(){
        
        Node b=head;
        
        while(b!=null){
            
            System.out.println(b.data+"\n");
            b=b.link;
        }
    }
    
    public int countNodes(){
        
        int count=0;
        
        Node current =head;
        
        while(current!=null){
            
            count++;
            current=current.link;
        }
        return count;
    }
    
    public static void main(String[] args){
        
        SimpleSinglyLikedList list= new SimpleSinglyLikedList();
        
        list.head=new Node(100);
        
        Node second=new Node(200);
        
        Node third=new Node(300);
        
        list.head.link=second;
        
        second.link=third;        
        
        list.display();
        
        //Get count of nodes and display
        System.out.println("Number of nodes present in list:"+list.countNodes());
    }
}
