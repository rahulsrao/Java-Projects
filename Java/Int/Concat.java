class present
{
	static String value="";
	String display="";
	public void print()
	{	
		System.out.println(display);
	}
}

class Concat
{
	public static void main(String argv[])
	{
		present Name=new present();
		Name.value="a";
		Name.display=Name.value.concat(argv[0]);
		Name.print();
	}
}