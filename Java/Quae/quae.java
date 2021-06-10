class data
{
	static int[] a={1,2,3,4,5,6};
	public static void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

class quae extends data{

	public static void main(String argv[])
	{
		int temp=0;
		for(int i=0;i<=(a.length-1);i++)
		{
			if(i==0)
			{
				temp=a[i];
				a[i]=a[i+1];
				System.out.println("The 0 index value is "+a[i]);
				
			}

			if(i==(a.length-1))
			{
				System.out.println("The temp value is "+temp);
				a[i]=temp;
			}
			else
			{
				a[i]=a[i+1];
			}
		}
		data.display();
					
	}
}