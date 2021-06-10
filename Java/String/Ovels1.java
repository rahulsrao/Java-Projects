class Ovels1
{
	public static void main(String a[])
	{	
		String value=a[0];
		char[] ch=value.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			
			System.out.print(ch[i]);
		}
	
		for(int j=0;j<Text.length-1;j++)
		{
			if(ch[j].equals("A") || ch[j].equals("a"))
			{
				System.out.println(ch[j]+"is ovel");
			}
			else if(ch[j].equals("E") || ch[j].equals("e"))
			{
				System.out.println(ch[j]+"is ovel");
			}
			else if(ch[j].equals("I") || ch[j].equals("i"))
			{
				System.out.println(ch[j]+"is ovel");
			}
			else if(ch[j].equals("O") || ch[j].equals("o"))
			{
				System.out.println(ch[j]+"is ovel");
			}
			else if(ch[j].equals("U") || ch[j].equals("u"))
			{
				System.out.println(ch[j]+"is ovel");
			}
			else
			{
				System.out.println(ch[j]+"is a consonent");	
			}
		}
	}

}