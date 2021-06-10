class Sums
{
public static void main(String argv[])
{
int a=Integer.parseInt(argv[0]);
int b=Integer.parseInt(argv[1]);
//int sum=a+b;
int sum=Integer.sum(a,b);
System.out.println("sum="+sum);
Integer intObj1=new Integer(a);
Integer intObj2=new Integer(b);
System.out.println(intObj1.compareTo(intObj2));
Integer intObj=new Integer(sum);
System.out.println(intObj.hashCode());
}
}
