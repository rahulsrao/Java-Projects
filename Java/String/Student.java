interface Details
{
	void Getdata();
}


interface Marks
{
       void GetMarks();
	void displayResult();
}

class Student implements Details,Marks
{
	
	String RegNo,Name;
	int M1,M2,M3,sum;
	
	public  void Getdata()
	{
		Name ="Name1";
		RegNo="1BEV";
	}
	public void GetMarks()
	{
		M1=50;
		M2=80;
		M3=75;
	}		

	public void displayResult()
	{
		sum=M1+M2+M3;
		System.out.println("The Total marks is equals to ="+sum);		
	}

}
class data 
{
	public static void main(String Args[])
	{	Student obj=new Student();
			obj.Getdata();
			obj.GetMarks();
			obj.displayResult();
	}

}