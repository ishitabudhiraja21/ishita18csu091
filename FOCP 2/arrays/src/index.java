import java.util.*;
class index
{
	public static void main(String args[]){
	int[] arr= new int[10];
	
	System.out.println("Enter the element to search");
	Scanner scan=new Scanner(System.in);
	for(int x=0;x<10;x++)
	{ 
	System.out.println("Enter values");
		arr[x]=scan.nextInt();
		}

	 		System.out.println("Enter values to be searched");
		int searchVal= scan.nextInt();
		
		int index=-1;
		for(int i=0;i<10;i++)
		{
		System.out.println(" " + arr[i]);
		if (searchVal==arr[i])
		{
		index=i;
		}
		}
		System.out.println("Index = "+index);
	}

}


