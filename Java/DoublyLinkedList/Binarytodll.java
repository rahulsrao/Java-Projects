public class Binarytodll {
    
    public static class Node
    {    
        int data;    
        Node left;    
        Node right;    
        public Node(int data) 
        {    
            this.data = data;    
            this.left = null;    
            this.right = null;    
        }    
    }    
    public Node root;   
    Node head, tail = null;
    public void converToDLL(Node node)
    {            
        if(node == null)
        {
            return;
        }

        converToDLL(node.left);    
        
        if(head == null) 
        {    
            head = tail = node;    
        }
        
        else 
        {    
            tail.right = node;    
            node.left = tail;    
            tail = node;    
        }        
        converToDLL(node.right);   
    }    
        
    public void display() 
    {    
        Node current = head;    
        if(head == null) 
        {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Double Linked list: ");    
        
        while(current != null) 
        {    
            System.out.print(current.data + " ");    
            current = current.right;    
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) 
    {    
            
        Binarytodll bt = new Binarytodll();    
        
        bt.root = new Node(10);    
        bt.root.left = new Node(8);    
        bt.root.right = new Node(12);    
        bt.root.left.left = new Node(5);    
        bt.root.left.right = new Node(9);    
        bt.root.right.left = new Node(14);    
        bt.root.right.right = new Node(15);    

        bt.converToDLL(bt.root);    
        bt.display();    
    }    
}