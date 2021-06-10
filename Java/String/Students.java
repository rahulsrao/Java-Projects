class Details
{
String name="";
int age;
String sub="";
public void parseInt()
{
System.out.println(name+" "+age+" "+sub);
}
}
class Students
{
public static void main(String a[])
{
Details Rahul=new Details();
Rahul.name="Rahul";
Rahul.age=24;
Rahul.sub="Science";
Rahul.parseInt();
Details prashanth=new Details();
prashanth.name="prashanth";
prashanth.age=18;
prashanth.sub="BCA";
prashanth.parseInt();
/*Details.name="Rahul";
Details.age=24;
Details.sub="Science";
Details.display();*/
}
}