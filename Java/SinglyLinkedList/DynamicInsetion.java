import java.io.InputStreamReader;
import java.util.Scanner;

public class DynamicInsetion {
    
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

    public void frontAdd(int data){
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
    
    public void endAdd(int data){
    Node newNode= new Node(data);
    //Verify whether list is empty
    if(head==null){
    head=newNode;
    link=newNode;
    }
    else{
        
        link.Next=newNode;
        link=newNode;
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
         
        DynamicInsetion lists=new DynamicInsetion();

        lists.frontAdd(250);
        lists.frontAdd(320);
        lists.endAdd(255);

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Please tell me which end should be inserted: ");
        String EndInsert = scanner.nextLine();

        System.out.println("Insert End is : " + EndInsert);
        
        System.out.println("Please enter your input F/E: ");
        int input = scanner.nextInt();
        System.out.println("User Input from console: " + input);


        if(EndInsert.equals("F")){
            lists.frontAdd(input);
        }
        else if(EndInsert.equals("E")) {
            lists.endAdd(input);
        }

        lists.display();
     }
}
