class Date
{
	int month,day,year;
	void DisplayDate()
	{
	System.out.print(" "+month);
	System.out.print("/"+day);
	System.out.print("/"+year);

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
	
	Date my=new Date(1,1,2000);
	my.DisplayDate();
}


}