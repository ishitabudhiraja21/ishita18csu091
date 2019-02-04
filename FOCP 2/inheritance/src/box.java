
class box
{
	double width,heigth,depth;
	box()
	{
	this.width=0;
	this.heigth=0;
	this.depth=0;
	}
	box(double width,double heigth,double depth)
	{
	this.width=width;
	this.heigth=heigth;
	this.depth=depth;
}
	public  void setWidth(double width)
	{
	this.width=width;
	}
	public void getWidth()
	{
	System.out.println("width is "+this.width);
	}
	public  void setHeigth(double heigth)
	{
	this.heigth=heigth;
	}
	public void getHeigth()
	{
	System.out.println("heigth is "+this.heigth);
	}
	public  void setDepth(double depth)
	{
	this.depth=depth;
	}
	public void getDepth()
	{
	System.out.println("depth is "+this.depth);
}
     public void display()
     {
    double volume=width*heigth*depth;
   System.out.println("volume is:"+volume);
 }
}