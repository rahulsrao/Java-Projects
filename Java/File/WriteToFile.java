import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile 
{

  public static void main(String[] args)
  {
    try 
    {
      FileWriter myWriter = new FileWriter("NewFile.txt");
      myWriter.write("Hi I am writing the text in the new text file!!");
      myWriter.close();
      System.out.println("Successfully written the text into the file.");

    } 
    catch (IOException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}