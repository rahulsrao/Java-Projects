public class Matrix_Multiply {
    
    public static void main(String args[])
    {  
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};    
        int B[][]={{2,4,6,8},{10,12,14,16},{18,20,22,24}};    

        int C[][]=new int[3][4];
    
        for(int i=0;i<3;i++)
        {    
            for(int j=0;j<4;j++)
            {    
                C[i][j]=0;      
                for(int k=0;k<3;k++)      
                {      
                    C[i][j]+=A[i][k]*B[k][j];      
                }  
            System.out.print(C[i][j]+" ");  
            }  
            System.out.println();   
        }    
    }
}
