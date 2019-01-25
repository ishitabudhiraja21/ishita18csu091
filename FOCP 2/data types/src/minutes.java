import java.util.*;
class minutes
{
	public static void main(String args[])
	{
	int minutes,year,months,days;
	minutes=1655590;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter minutes");
	year=minutes/(365*24*60);
	months=minutes/(30*24*60);
	days=minutes/(24*60);
	System.out.println("year is"+year);
	System.out.println("months is"+months);
	System.out.println("days is "+days);

	}
}