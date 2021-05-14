class dataStudent
{
	static String [] A={"1a1","2b1","3c3","4d5","6z8"};
	static int [] B={90,77,58,48,28};
	
}
class Notice extends dataStudent
{
	public static void main(String args[])
	{
		for(int i=0;i<A.length;i++)
		{
			if(B[i]>85)
			{
				System.out.println(A[i]+"has obtained Distinction");
			}
			else if(B[i]>75)
			{
				System.out.println(A[i]+"has obtained First class marks");	
			}
			else if(B[i]>55)
			{
				System.out.println(A[i]+"has obtained Second class marks");	
			}
			else if(B[i]>35)
			{
				System.out.println(A[i]+"has obtained Passing marks");	
			}
			else
			{
				System.out.println(A[i]+"has Failed");	
			}
			

		}
	}

}
