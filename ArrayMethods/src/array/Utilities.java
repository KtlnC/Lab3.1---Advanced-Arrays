package array;

public class Utilities {
	
	//helper methods for removeDuplicates()
	public static void  printArray(int[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
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
	
	//helper methods for productArray()
	public static void printdoublearray(int[][] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
