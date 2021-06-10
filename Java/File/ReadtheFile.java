import java.io.FileReader;
import java.io.IOException;

public class ReadtheFile 
{

    public static void main(String[] args)
    {
        try
        {
          FileReader myFile = new FileReader("NewFIle.txt");
          int i;
          while((i=myFile.read())!=-1)
          { 
                int data=i;
                System.out.println(data);
          }
          myFile.close();
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }
    
}
