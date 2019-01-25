class Employee
{
	String empName,empCity,empDep;
	double empSalary;
	int empCode;
	void information()
	{
	System.out.println("empName is"+empName);
	





	
	System.out.println("salary is"+salary);
	
	}
	Employee(double s,int code,String n,String city,String dep)
	{
	this.empSalary=s;
	this.empCode=code;
	this.empName=n;
	this.empCity=city;
	this.empDep=dep;
	}
	Employee()
	{
	this.salary=0;
	this.empCode=0
	this.empName=0;
	this.empCity=0;
	this.empDep=0;
	}




	public static void main(String args[])
	{
	Employee p=new Employee(50000,59,"Anu","Faridabad","Mech");
	Employee r=new Employee(25000);
	
	p.information();
	
	p.information();
	}
}