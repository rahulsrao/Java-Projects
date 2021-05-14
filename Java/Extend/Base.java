public class Base{
  
  protected int multiplier(int data)
  {
    return data*5;
  }
}


class Derived extends Base
{
  private static int data;
  public Derived()
  {
    data=25;
  }
  public static void main(String[] args)
  {
    Base temp=new Base();
    System.out.println(temp.multiplier(data));
  }
}