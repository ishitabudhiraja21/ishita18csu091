import java.util.*;
class pascal1
{
	public static void main(String args[])
	{
	int no_row=5,c=1,i,j,blk;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the no. of rows:");
	no_row=scan.nextInt();
	for(i=0;i<no_row;i++)
	{
	for(blk=1;blk<=no_row-i;blk++)
	System.out.print(" ");
	for(j=0;j<=i;j++)
	{
	if(j==0||i==0)
	c=1;
	else
	c=c*(i-j+1)/j;
	System.out.print(" "+c);
	}
	System.out.print("\n");
	}
}
}