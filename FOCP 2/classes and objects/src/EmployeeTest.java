class Employee
{
	String first_name,last_name;
	double salary;
	void information()
	{
	System.out.println("first name is :" +first_name);
	System.out.println("last name is :" +last_name);
}


void yearlySalary()
{
	
	if(salary<0)
	{
	System.out.println("re enter salary");
	}
	else
	{
		System.out.println("Salary is "+salary);
	}
	}
	Employee(double s,String f,String l)
	{
	this.salary=s;
	this.first_name=f;
	this.last_name=l;
	}
	Employee()
	{
	this.salary=0;
	}

}
class EmployeeTest
{
	public static void main(String args[])
	{
	Employee p=new Employee(50000.0,"Anil","chopra");
	
	p.information();
	p.yearlySalary();
	Employee r=new Employee(25000.0,"Anju","kumar");
	
	r.information();
	r.yearlySalary();
	
	}
}