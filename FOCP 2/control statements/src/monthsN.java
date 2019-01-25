import java.util.*;
class monthsN
{
	public static void main(String args[])
	{
	int num;
	Scanner scan=new Scanner(System.in);
	num=scan.nextInt();
	System.out.println("enter number between 1 to 12");
	

	switch(num)
	{
	case 1: System.out.println(" the name of month 1 is january");
	case 2: System.out.println("the name of month 2 is febraury");
	case 3:System.out.println ("the name of month 3 is march");
	case 4: System.out.println("the name of month 4 is april");
	case 5: System.out.println("the name of month 5 is may");
	case 6: System.out.println("the name of month 6 is june");
	case 7: System.out.println("the name of month 7 is july");
	case 8: System.out.println("the name of month 8 is august");
	case 9 : System.out.println("the name of month 9 is september");
	case 10: System.out.println("the name of month 10 is october");
	case 11: System.out.println("the name of month 11 is november");
	case 12: System.out.println("the name of month 12 is decenber");
	break;
	
	default: System.out.println("error");
	}
}
	
	
	
	
}