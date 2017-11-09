/**
 * Author: Kaitlyn Cao and Lamia Islam
 * Created 11/6/17
 * Lab 3.1 - Advanced Arrays
 * */
public class ArrayMethods {

	public static void main (String[] args)
	{
		int[] array = {0,0,0,2,3,3};
		System.out.print(originals(array));
	}
	
	public static int[] removeDuplicates(int[] list)
	{
		int count = countDuplicates(list);
		
		int[] arr = new int[list.length-count];
		
		return arr;
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
		int counter = 0;
		int num = 0;
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
	
}
