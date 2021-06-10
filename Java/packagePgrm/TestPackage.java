import pack1.ClassA;
import pack2.*;
class TestPackage
{
	public static void main(String a[])
	{
	
		ClassA obj1=new ClassA();
		obj1.display();
		ClassB obj2=new ClassB();
		obj2.display();
		System.out.println("m value is "+obj2.m);
	}
}
