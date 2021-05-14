class GetString
{
	public static void main(String args[])
	
	{	
		GetString abc=new  GetString();
		int a=args[1].length();
		int b=a/2;
		System.out.println(a+" "+b);
		
		if(args[0].equals("F"))
		{
			//String word=args[1].substring(0,b);
			//System.out.print(word);
			
			abc.Firsthalf(args[1],b);
		}
		else
		{
			//String word1=args[1].substring(b,a);
			//System.out.print(word1);
			abc.Secondhalf(args[1],a,b);	
		}

	}
	void Firsthalf(String Str,int last)
	{
		
		String word=Str.substring(0,last);
		System.out.print(word);			
	}
	
	void Secondhalf(String Str,int Fist,int Last)
	{
		String word1=Str.substring(Last,Fist);
		System.out.print(word1);
	}

}