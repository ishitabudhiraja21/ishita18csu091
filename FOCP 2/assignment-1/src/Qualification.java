class Qualification
{
	String qualName;
String university;
String institute;
int cgpa;
Qualification(String qualName,String university,String institute,int cgpa)
{
	this.qualName=qualName;
	this.university=university;
	this.institute=institute;
	this.cgpa=cgpa;
}
void display()
{
	System.out.println("Qualification:"+qualName);
	System.out.println("university:"+university);
	System.out.println("institute:"+institute);
	System.out.println("cgpa;"+cgpa);
}

}
