import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadScanner
{ 
    public static void main(String[] args) 
    {
        try 
        {
          File myfile = new File("NewFile1.txt");
          Scanner myReader = new Scanner(myfile);
          while (myReader.hasNextLine()) 
          {
            String data = myReader.nextLine();
            System.out.println(data);
          }
          myReader.close();
        } 
        catch(FileNotFoundException e) 
        {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }
}
