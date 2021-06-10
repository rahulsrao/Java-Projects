public class StringtoArray{ 
  
    public static void main(String args[]) 
    { 
        String Text= "Hi buddy how are you ?"; 
 
        char[] ch= new char[Text.length()];
	
	System.out.println("The length of Text is "+Text.length());  	
	
        for (int i=0; i<Text.length(); i++) 
	{ 
            ch[i]=Text.charAt(i); 
        } 

   	for(int j=0; j<Text.length(); j++)
	{
            System.out.println(ch[j]); 
        }
	 
    } 
}