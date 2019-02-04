class cylinder extends circle
{
	double heigth=1.0;
	cylinder()                                                                               
	{
		super();
		

	}
	public cylinder(double radius)
	{
		super(radius);

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
	public void display()
	{
		System.out.println("radius is:"+radius);
		System.out.println("colour is:"+colour);
		super.display();
		System.out.println("heigth is :"+heigth);
	}
}
	