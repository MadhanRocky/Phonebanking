package sortingarray;
import java.util.*;
public class Sort {
	
	public static void insertionsort(int array[])
	{
		int n=  array.length;
		for(int j= 1;j<n;j++);{
		int Key= array[j];
		int i= j-1;
		while ((i>-1)&&(array[i]> key))
		{
		array[i+1]=array[i];
		i--;
		}
		
		}
		
	}
public static void main( String args[])
{
	int arr[]= { 23, -9 , 10,46, -13};
	System.out.println("Before sorting :");
	for(int before: arr)
	{
		System.out.print("before");
	}
	sortInsertion(arr);
	System.out.println("after sorting :");
	for(int after : arr)
	{
		System.out.print("after");
	}
}
}


