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
	Box myBox=new Box();
	myBox.setDim();
	double volume=myBox.volume();
	System.out.println("volume:"+volume);

	}
}