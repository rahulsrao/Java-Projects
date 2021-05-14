public class PrimeNumber{
  
public static void main(String a[])
{    
 int m=0;
 for(int i=0;i<a.length-1;i++)
 {      
 	int n=Integer.parseInt(a[i]);    
 	m=n%2;       
 	if(m==0){  
   	System.out.println(n+" is not prime number");      
 	}
 	else{  
    	System.out.println(n+" is prime number");       
 	}      
  }
 } 
} 