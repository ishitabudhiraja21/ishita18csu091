class circle
{
	int r;
	void display()
	{
	System.out.println("radius is:"+r);
}
	circle(int radius)
		{
		this.r=radius;
	}
	
	
	circle()
	{
this.r=1;
}




void area()
{
double area=3.14*r*r;
System.out.println("area is :"+area);

}
void circumference()
{
double circumference=2*3.14*r;
System.out.println("circumference is"+circumference);

}
public static void main(String args[])
{
	circle c=new circle(10);
	
	c.display();
	c.area();
	c.circumference();
}
}