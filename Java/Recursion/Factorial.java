public class Factorial {
    
    static int factorial(int num)
    {
        if(num>0)
        {
            return (num * factorial(num-1));
        }
        else
        {
            return 1;
        }

    }

    public static void main(String args[])
    {      
        int Fact=1;
        Fact = factorial(5);   
        System.out.println("Factorial of 5 is : "+Fact);    
    }  
}
