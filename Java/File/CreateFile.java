import java.io.File;
import java.io.IOException;

public class CreateFile 
{

  public static void main(String[] args) 
  {
        try 
        {
            File myfile = new File("NewFile.txt");
            if (myfile.createNewFile()) 
            {
                System.out.println("File created: " + myfile.getName());
            } 
            else 
            {
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
  }
}