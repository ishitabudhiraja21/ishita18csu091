class Parent1
{
	static int i=10;
	Parent1()
	{
	System.out.println("value of i in parent class is :"+i);
	}
}
	class child1 extends Parent1
	{
	child1()
	{
	super();
	System.out.println(" child class :"+i);
	}
	}
	class child2 extends child1
	{
		child2()
		{
			super();
			System.out.println("child2 class :"+i);
		}
	}

class inherit
{
	public static void main(String args[])
	{
	child1 ob=new child1();
	child2 ob2=new child2(); 
	}
}