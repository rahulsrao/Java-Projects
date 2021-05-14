import java.util.Scanner;

public class BuildLetterA {
    int n=10;
   
    void display()
    {
        //number of lines
        for (int i = 0; i < n; i++) {
  
            for (int j = 0; j <= n / 2; j++) {
  
                //2 column lines
                if ((j == 0 || j == n / 2) && i != 0 ||
  
                    //first line
                    i == 0 && j != 0 && j != n / 2 ||
  
                    //middle line
                    i == n / 2)
  
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
  
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        BuildLetterA a = new BuildLetterA();
        a.display();
    }
    
    
}
