class ExceptionT
{
	ExceptionT(String msg)
	{
	msg="exception handling";
	System.out.println("msg");
	}
	public static void main(String args[]) throws Exception
	{
          try
          {
          throw new Exception();
          }
          catch(Exception e)
          {
          
          System.out.println(e);
          }
          finally
          {
          System.out.println("you were there");
          }
	}
}n