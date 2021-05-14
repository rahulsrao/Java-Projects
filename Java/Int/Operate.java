class data
{
	static int a;
	static int b;
	static String op="";
	static int total;	

	public static void display()
	{
		System.out.println(a+""+op+""+b+"="+" "+total);  
	}	
}
class Operate
{
	public static void main(String args[])
	{
		data.a=Integer.parseInt(args[0]);
		data.b=Integer.parseInt(args[1]);
		data.op=args[2];
		if(args[2].equals("+"))
		{
			data.total=data.a+data.b;
		}
		else if(args[2].equals("-"))
		{
			data.total=data.a-data.b;	
		}
		else if(args[2].equals("x"))
		{
			data.total=(data.a)*(data.b);	
		}
		else
		{
			data.total=(data.a)/(data.b);	
		}
		data.display();		
	}
}