/*
How do you find the missing number in a given integer array of 1 to 100?
*/

import java.util.Random;

class FindMissingNumber
{
	public static void main(String args[])
	{
		methodOne(getArray());
		methodTwo(getArray());
	}
	
	public static void methodOne(int[] num)
	{
		int s = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			s += num[i];
			System.out.println("num["+i+"]="+num[i]);
		}
		
		int d = (num.length + 1) * num.length / 2;
		int missing = d - s;
		System.out.println("Method 1 : Missing Number " + missing);
	}
	
	public static void methodTwo(int[] num)
	{
		int m = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] != 0) m ^= num[i];
			m ^= (i + 1);
		}
		
		System.out.println("Method 2 : Missing Number " + m);
	}
	
	public static int[] getArray()
	{
		int m = new Random().nextInt(100) + 1;
		int num[] = new int[100];
		
		for(int i = 0; i < 100; i++)
		{
			if(i == m) { num[i] = 0; }
			else { num[i] = i + 1; }
		}
		return num;
	}
}