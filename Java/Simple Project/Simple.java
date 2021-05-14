class Simple{  
    public static void main(String args[]){  
     
    System.out.println("Hello Java");

     try
    {
         System.out.println(args[0]);
         System.out.println(args[1]);
         System.out.println(args[2]);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }   
    }  
}  
