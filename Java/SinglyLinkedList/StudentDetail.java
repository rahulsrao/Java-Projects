import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class StudentDetail {
    
    class Node
    {
      String Name; 
      String data;
      Node next;
      public Node(String data, String name)
      {
        this.Name=name;
        this.data=data;
        this.next=null;
      }
    }

    public Node head=null;
    public Node tail=null;

    public void add(String data,String Name)
    {    
        Node newNode= new Node(data,Name);  
         if(head==null)
         {
            head=newNode;
            tail=newNode;   
         }
        else
        {    
          tail.next = newNode;  
          tail = newNode; 
       }
    }

    public void display()
    {

      Node current=head;

      if(head==null)
      {
        System.out.println("List is empty");
        return;
      }

      System.out.println("Adding nodes to list");

      while(current!=null)
      {
        System.out.println(current.data+":"+current.Name);
        current=current.next;
      }
      System.out.println();
    }



    public static void main(String args[]) throws IOException
    {
      StudentDetail Lists= new StudentDetail();
        try 
        {
          File myfile = new File("StudentData.txt");
          FileWriter myWriter = new FileWriter("ReadData.txt");
          Scanner myReader = new Scanner(myfile);
          String [] Header={"Name","Id","Phone"};
          int i=0;
          while (myReader.hasNext()) 
          {
            String data = myReader.next();

            if(i==Header.length-1)
            {
                Lists.add(Header[i], data);
                myWriter.write(Header[i]+":"+data+" \n");
                i=0;
            }
            else
            {
                myWriter.write(Header[i]+":"+data+" ");
                Lists.add(Header[i], data);
                i++;
            }
          }
          Lists.display();
          myReader.close();
          myWriter.close();
        } 
        catch(FileNotFoundException e) 
        {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }     
}
