class boxWeigth extends box
{
double weigth,volume;
	boxWeigth()
	{
	super();
	}
	boxWeigth(double width,double heigth,double depth)
	{
	super(width,heigth,depth);
	}
	boxWeigth(double weigth)
	{
	this.weigth=weigth;
	}
	public void display()
	{
		System.out.println("width is:"+width);
         System.out.println("heigth is :"+heigth);
         System.out.println("depth is :"+depth);
         System.out.println("volume is :"+volume);
	super.display();
	System.out.println("weigth of box is:"+weigth);
	}
}