import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

public class ListFromFile 
{
    public static void main(String args[]) throws IOException
    {
        LinkedList<Integer> List= new LinkedList<Integer>();

        try 
        {
          File myfile = new File("NewFile.txt");
          FileWriter myWriter = new FileWriter("NewFile1.txt");
          Scanner myReader = new Scanner(myfile);
          while (myReader.hasNext()) 
          {
            String data = myReader.next();
            int Data=Integer.parseInt(data);
            List.add(Data);
            myWriter.write(data);
            System.out.println(List);
          }
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
