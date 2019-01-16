import java.util.*;
class numbers
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	int num;
	System.out.println("Enter a number with 5 digits:");
	num=input.nextInt();
	if((num>=10000) &&(num<=99999))
	{
	System.out.println("%d",(num/10000));
	System.out.println("%d",(num/1000)%10);
	System.out.println("%d",(num/100)%10);
	System.out.println("%d",(num%100)/10);
	System.out.println("%d",(num%10));
	}
	else
	{
	System.out.println("Wrong number");
	}

	}
}