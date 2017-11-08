/**
 * Author: Kaitlyn Cao and Lamia Islam
 * Created 11/6/17
 * Lab 3.1 - Advanced Arrays
 * */
public class ArrayMethods {

	public static void main (String[] args)
	{
		
	}
	
	public static int[] removeDuplicates(int[] list)
	{
		int[] arr = list;
		for(int i = 0; i < list.length; i++)
		{
			for(int j = i + 1; j < list.length; j++)
			{
				if(list[i] == list[j])
				{
					
				}
			}
		}
		return arr;
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
