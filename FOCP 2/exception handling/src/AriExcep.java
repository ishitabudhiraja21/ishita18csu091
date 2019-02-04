class AriExcep
{
	public static void main(String args[])
	{
	int i=10;
	try
	{
	i=10/0;
	System.out.println("i");
	}
	catch(ArithmeticException e)
	{
	System.out.println(e);
	}
	try
	{
		 int a[]=new int[5];  
 
		a[5]=4;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	try
	{
		String s="abc";
		int b=Integer.parseInt(s);
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	try
	{
		String t=null;
		System.out.println(t.length());
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	
	System.out.println("rest");
	}
}