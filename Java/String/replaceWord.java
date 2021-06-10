class replaceWord
{
	public static void main(String args[])
	{
		String Message="Hi buddy how are you ?";
		String Message1=Message.replaceAll("buddy",args[0]);
		System.out.println(Message1);
		
	}

}