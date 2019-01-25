class mergeArray
{
	public static void main(String args[])
	{
	int arr1[]={1,5,6,7};
	int n1=arr1.length;
	int arr2[]={2,3,8,9,10};
	int n2=arr2.length;
	int merge[]= new int[n1+n2];
	int i=0,j=0,k=0,x;
	System.out.println("array1:");
	for(x=0;x<n1;x++)
	{
	System.out.println(" "+arr1[x]);
	}
	System.out.println("array2:");
	for(x=0;x<n2;x++)	{
	System.out.println(" "+arr2[x]);
	}
	while(i<n1 && j<n2)
	{
	if(arr1[i]<arr2[j])
	{
	merge[k++]=arr1[i++];
	}
	else
	{
	merge[k++]=arr2[j];
	}
	while(i<n1)
	merge[k++]=arr1[i++];
	while(j<n2)
	merge[k++]=arr2[j++];
	System.out.println("array after merging:");
	for(x=0;x<n1+n2;x++)
	{
	System.out.println(" "+merge[x]);
	}
	}
	}
}