public class SortName {
    
    public static void main(String[] args) 
    {  
        String names[] = { "Rahul", "Anand", "Mallesh", "Prashanth","Girsih"}; 
        String temp; 
        
        for (int i = 0; i < names.length-1; i++)
        { 
            for (int j = i + 1; j <names.length-1; j++)
            { 
                
                // to compare one string with other string 
                if (names[i].compareTo(names[j]) > 0) 
                { 
                    //swape 
                    temp = names[i]; 
                    names[i] = names[j]; 
                    names[j] = temp; 
                } 
            }
        }
        
        // print output array 
        System.out.println("The names in alphabetical order are: ");
        
        for (int i = 0; i <names.length-1; i++)
        { 
            System.out.println(names[i]); 
        } 
    } 
}
