class A
{
	int l,br;
	int dVar1,dVar2;
	void area(int a,int b)
	{
		l=a;
		br=b;
	}
	void display()
	{
		System.out.println("res="+l*br);
	}

}
class B extends A
{
	int c;
	void input(int a,int b,int d)
	{
		dVar1=a;
		dVar2=b;
		c=d;
	}
	void input(int a,int b)
	{
		area(a,b);
	}
	void display()
	{
		System.out.println("res="+l*br*c);
		super.display();
	}
}
class dummyClass extends B
{
	int c;
	void input(int a,int b,int d)
	{
		dVar1=a;
		dVar2=b;
		c=d;
	}
	void display()
	{
		super.display();
	}
}
class TestInherit
{
	public static void main(String argv[])
	{
		B bObj=new B();
		bObj.input(50,10,20);
		bObj.input(1,2);
		bObj.display();
		dummyClass dObj=new dummyClass();
		dObj.input(2,3,4);
		dObj.display();
	}
}
