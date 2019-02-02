class circle
{
	double radius=1.0;
	String colour="red";
	public circle()
	{
	this.radius=0;
	}
	public circle(double radius)
	{
	this.radius=radius;
	}
	public circle(double radius,String colour)
	{
      this.radius=radius;
      this.colour=colour;
	}
	public double setRadius()
	{
	 this.radius;
	}
	public double getRadius()
	{
	return this.radius;
	}
String setColour()
{
	this.colour;
}
String getColour()
{
	return this.colour;
}
public double setArea()
{
area = 3.14*radius*radius;
this.area;
}
public double getArea()
{
	return this.area;
}
}
class cylinder extends circle
{
	double heigth=1.0;
	cylinder()                                                                               
	{
		super();
		this.heigth=0;
		this.radius=0;

	}
	public cylinder(double radius)
	{
		this.radius=radius;

	}
	public cylinder(double radius,double heigth)
	{
		this.radius=radius;
		this.heigth=heigth;
	}
	public cylinder(double radius,double heigth,String colour)
	{
		this.radius=radius;
		this.heigth=heigth;
		this.colour=colour;
	}
	public setHeigth()
	{
		this.heigth;
	}
public getHeigth()
{
	return this.heigth;
}
public double setVolume()
{
volume=3.14*radius*radius*heigth;
this.volume;
}
public double setVolume()
{
	return this.volume;
}
}
class TestCylinder
{
	public static void main(String args[])
	{
		cylinder obj=new cylinder();
	}
}
