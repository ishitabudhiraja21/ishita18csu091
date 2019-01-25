import java.util.*;
class RhombusPattern
{
	public static void main(String args[])
	{
	char ch;
	ch='A';
	int i,j,k,no_rows;
	Scanner scan=new Scanner(System.in);
	no_rows=scan.nextInt();
	int counter=0;
	for(i=0;i<=(no_rows*2);i++)
	{
	ch='A';
	for(int a=counter;a<=no_rows;a++)
	{
	System.out.print(" ");
	}
	for(j=0;j<counter;j++)
	{
	System.out.print(ch);
	ch++;
	}
	for(k=counter;k>=0;k--)
	{
	System.out.print(ch);
	ch--;
	}
	System.out.print("\n");
	if(i>=no_rows)
	{
	counter--;
	}
	else
	counter++;
	}
	}
}