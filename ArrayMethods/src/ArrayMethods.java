/**
 * Author: Kaitlyn Cao and Lamia Islam
 * Created 11/6/17
 * Lab 3.1 - Advanced Arrays
 * */
public class ArrayMethods {

	public static void main (String[] args)
	{
		int[] array = {0,0,0,2,3,3};
		System.out.println(originals(array));
		printArray(removeDuplicates(array));
	}
	public static void  printArray(int[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static int[] removeDuplicates(int[] list)
	{
		int count = originals(list);
		
		int[] arr = new int[count];
		int counter = 0;
		for(int i = 0; i<list.length;i++) 
		{		
				if(!(contains(arr,list[i])))
				{
					arr[counter] = list[i];
					counter++;
					//System.out.print(counter);
				}

		}
		return arr;
	}
	
	public static boolean contains(int[] list, int num)
	{
		for(int i = 0;i<list.length;i++)
		{
			if(list[i]==num)
			{
				return true;
			}
			
		}
		return false;
		
	}
	
	public static int countDuplicates(int[] nums)
	{
		int counter = 0;
		for(int i = 0; i<nums.length-1;i++)
		{
			for(int j = i+1; j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					counter++;
				}
			} 
		}
		return counter;
	}
	
	public static int originals(int[]nums)
	{
		int count = 0;
		
		for(int i = 0; i<nums.length; i++)
		{
			//Assume the number is unique at first
			boolean unique = true; 
			
			//Check all the subsequent nums
			 for (int j = i+1; j<nums.length; j++)
			 {
				 if(nums[i] == nums[j])
				 {
					 unique = false; // If we found an equivalent number, unique is false 
					 break; //No need to check the rest of the inner for loop
				 }
			 }
			 //If unique stayed true, we add 1 to the unique count
			 if(unique)
			 {
				 count++;
			 }
		}
		return count;
	}
	
	public static boolean containsDuplicates(int[] nums)
	{
		
		for(int i = 0; i<nums.length-1;i++)
		{
			for(int j = i+1; j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					return true;
				}
			} 
		}
		return false;
	}
	
}
