class Date
{
	int month,day,year;
	void DisplayDate()
	{
	System.out.println("month is"+month);
	System.out.println("year is/"+year);
	System.out.println("day is/"+day);

	}
	Date(int m,int d,int y)
	{
	this.month=m;
	this.day=d;
	this.year=y;
	}
	Date()
	{
	this.month=1;
	this.day=1;
	this.year=2000;
	}

}
class DateTest
{
	public static void main(String args[])
{
	
	Date my=new Date(2,4,2000);
	my.DisplayDate();
}


}