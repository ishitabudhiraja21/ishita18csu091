import java.util.*;
class floating
{
	public static void main(String args[])
	{
	Scanner scan= new Scanner(System.in);
	System.out.println("one folating number is :");
	double x=scan.nextDouble();
	System.out.println("other floating number is :");
	double y = scan.nextDouble();
	x=Math.round(x*1000);
	x=x/1000;
	y=Math.round(y*1000);
	y=y/1000;
	if(x==y)
	{
	System.out.println("they are same upto 3 decimal place");
	}
	else 
	{
	System.out.println("they are different upto 3 decimal place");
	}
	}
}