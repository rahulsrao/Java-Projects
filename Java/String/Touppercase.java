class Touppercase
{
	public static void main(String args[])
	{
		String Message="Hi buddy how are you ?";
		String Name=(args[0]).toUpperCase();
		String Message1=Message.replaceAll("buddy",Name);
		System.out.println(Message1);
		
	}
}