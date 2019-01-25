class EmployeeA
{
	int year,address,salary;
	String name;
	void information()
	{
	System.out.println("my name is /n"+name );
	System.out.println("address is /n"+address );
	System.out.println("year of joining is /n"+year);
	}
	EmployeeA()
	{
	this.name="null";
	this.year=0;
	this.address=0;
	this.salary=0;
    }
    EmployeeA(String n,int y,int a,int s)
    {
    this.name=n;
    this.year=y;
    this.address=a;
    this.salary=s;
    }

}
class EmployeeTestA
{
	public static void main(String args[])
	{
	int[] a=new int[10];
	EmployeeA[] a=new Employee[3];
	a[0]= new EmployeeA("Ram",1994,64C_Vasant_Kunj,50000);
	a[1]= new EmployeeA("Sam",2000,64D_dwarka,25000);
	a[2]=new  EmployeeA("Ana",1999,26B_RK_Puram,15000);

	a[0].information();
	a[1].information();
	a[2].information();
	}
}