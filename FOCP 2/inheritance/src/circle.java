
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
	public void display()
	{
		System.out.println("radius is:"+radius);
		System.out.println("colour is:"+colour);
	}
}