class circleN
{
	int r;
	void display()
	{
	System.out.println("radius is:"+r);
double area=3.14*r*r;
System.out.println("area is :"+area);

}
void area()
{
this.display;

}
void circumference()
{
double circumference=2*3.14*r;
System.out.println("circumference is"+circumference);
}
public static void main(String args[])
{
	circle c=new circle();
	c.r=2;
	c.display();
	c.area();
	c.circumference();
}
}