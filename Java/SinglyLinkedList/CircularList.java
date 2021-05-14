public class CircularList {
    
    public class Node{  
    int data;  
    Node next;  
    public Node(int data) {  
    this.data = data;  
    }  
    } 
     
    public Node head = null;  
    public Node tail = null;  


    public void add(int data){  
    Node newNode = new Node(data);  
    if(head == null) {  
    head = newNode;  
    tail = newNode;  
    newNode.next = head;  
    }  
    else {      
    tail.next = newNode;  
    tail = newNode;  
    tail.next = head;  
    }  
    } 
    
    public void display() {  
    Node present = head;  
    if(head == null) {  
    System.out.println("List is empty");  
    }  
    else {
    do{   
    System.out.print(" "+ present.data);  
    present = present.next;  
    }
    while(present != head);  
    System.out.println();  
    }  
    }
    
    public static void main(String[] args) {  
    CircularList CL = new CircularList();  

    //Adds data to the list  
    CL.add(10);  
    CL.add(22);  
    CL.add(33);  
    CL.add(44);  
    
    CL.display();  
    }  
}
