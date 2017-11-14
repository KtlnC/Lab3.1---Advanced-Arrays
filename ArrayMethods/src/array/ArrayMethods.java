package array;
/**
 * Author: Kaitlyn Cao and Lamia Islam
 * Created 11/6/17
 * Lab 3.1 - Advanced Arrays
 * */
import array.Utilities;
public class ArrayMethods {

	public static void main (String[] args)
	{
		//int[] array = {0,0,0,2,4,4};
		//int[] array = {1,2,3};
		//System.out.println(Utilities.originals(array));
		//Utilities.printArray(removeDuplicates(array));
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {3,9,4};
		Utilities.printdoublearray(productArray(arr1,arr2));
		
	}
	
	public static int[] removeDuplicates(int[] list)
	{
		int count = Utilities.originals(list);
		
		int[] arr = new int[count];
		int counter = 0;
		if(Utilities.containsDuplicates(list))
		{
			for(int i = 0; i<list.length;i++) 
			{		
				if(!(Utilities.contains(arr,list[i])))
				{
					arr[counter] = list[i];
					counter++;
					//System.out.print(counter);
				}
			}
			return arr;
		}
		return list;
	}
	
	public static int[][] productArray(int[] arr1, int[] arr2)
	{
		int[][] arr = new int[arr1.length][arr2.length];
		for(int i = 0;i<arr1.length;i++)
		{
			for(int j = 0;j<arr2.length;j++)
			{
				arr[i][j] = arr1[i]*arr2[j];
			}
		}
		return arr;
	}

	public static int[][] pascalTriangle(int n)
	{
		
	}
	
	public static void printPascalTriangle(int[][] pTriangle)
	{
		
	}
	
	
}
