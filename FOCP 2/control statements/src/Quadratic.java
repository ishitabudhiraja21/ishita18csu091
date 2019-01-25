import java.util.*;
import java.lang.Math;
class Quadratic
{
	public static void main(String args[])
	{
	int a,b,c,d;
	double root1,root2 ;
	
	 
	 Scanner scan=new Scanner(System.in);
	 System.out.println("given equation is  ax^2+bx+c");
	 System.out.println("Enter a");
	 a=scan.nextInt();
	 System.out.println("Enter b");
	  b=scan.nextInt();
	 System.out.println("Enter c");
	 c=scan.nextInt();
	 d=b*b-4*a*c;
		if(d>0){
		root1 = (-b+ Math.sqrt(d))/(2*a);
		root2 = (-b+Math.sqrt(d))/(2*a);
		
		System.out.println("root1=%.2f and root2=%.2f",root1,root2);

		}
		else if(d==0){
		root1=root2=-b/(2*a);
		System.out.println("roots are equal");
		};

		else{
		
		System.out.println("roots are imaginary");
		}
	}
}