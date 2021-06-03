import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class StudentDetail {
    

    public static void main(String args[]) throws IOException
    {
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
            myWriter.write(Header[i]+":"+data+" ");
            System.out.print(Header[i]+":"+data+" ");
            if(i==Header.length-1){
                i=0;
                System.out.println();
            }
            else{
                i++;
            }
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
