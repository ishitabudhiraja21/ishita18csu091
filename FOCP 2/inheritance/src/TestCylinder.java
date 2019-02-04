class TestCylinder
{
	public static void main(String args[])
	{
		cylinder obj=new cylinder();
		obj.display();
		cylinder ob2=new cylinder(1.0);
		ob2.display();
		cylinder ob3=new cylinder(1.0,1.0);
		ob3.display();
		cylinder ob1=new cylinder(1.0,1.0,"red");
         ob1.display();   
	}
}
