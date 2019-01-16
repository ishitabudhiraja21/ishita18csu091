class Box
{
	double width;
	double height;
	double depth;
	void setDim()
	{
	width=8;
	height=10;
	depth=4;
	}
	Box(double w,double h,double d)
	{
		this.width=w;
		this.heigth=h;
		this.depth=d;
	}
	Box()
	{
	this.width=0;
	this.heigth=0;
	this.depth=0;
	}
	double volume()

	{
	double volume=width*height*depth;
	return volume;
	}

}
class BoxDemo
{
	public static void main(String args [])
	{
	Box myBox=new Box(4,5,6);
    double vol=myBox.volume();
	System.out.println("volume after using constructors:"=vol);
	myBox.setDim();
	double volume=myBox.volume();
	System.out.println("volume:"+volume);
     
     System.out.println("volume after using constructors:"=volume);
	}
}