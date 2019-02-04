class check
{
static void display(int n)throws CheckArgumentException
{
	if(n<5)
	throw new CheckArgumentException("number of arg less than 5");
	else
	System.out.println("a+b+c+d+e");
}
	public static void main(String args[])
	{
      try
      {
        display(5);

      }
      catch(Exception m)
      {
      System.out.println(m);
      }
      System.out.println("rest of the code");
	}
}