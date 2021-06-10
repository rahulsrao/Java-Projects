import java.io.File;

public class DeleteFile {

    public static void main(String[] args) 
    { 
        File myfile = new File("NewFile.txt"); 

        if (myfile.delete()) 
        { 
          System.out.println(myfile.getName()+"  is deleted successfully!!");
        }
        else 
        {
          System.out.println("Failed to delete the file.");
        } 
      } 
    
}
