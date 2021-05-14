import java.util.Scanner;

public class PatternS {
    
    public static void main(String[] args) { 
      double x,y,m; 
      Scanner s1=new Scanner(System.in); 
      System.out.println("Enter the size"); 
      m=s1.nextDouble(); 
      for(y=2*m;y>=-2*m;y--){ 
      for(x=-m;x<=m;x=x+0.5){ 
        
      if(Math.pow(x,2)+Math.pow(Math.abs(y)-m,2)<=Math.pow(m,2)&&Math.pow(x,2)+Math.pow(Math.abs(y)-m,2)>=Math.pow(m/3,2)&&Math.abs(y)>=m ||(Math.abs(3*x+2*y)<=m&&y<=m&&y>-m)){ 
      System.out.print("* "); 
      } 
      else{ 
       System.out.print("  "); 
      } 
      } 
       System.out.println(""); 
      } 
    }   
    
    
}
