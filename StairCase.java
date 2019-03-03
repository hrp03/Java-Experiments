/*
Suppose you want climb a staircase of N steps, and on each step you can take either 1 or 2 steps. How many distinct ways are there to climb the staircase? For example, if you wanted to climb 4 steps, you can take the following distinct number of steps: 
1) 1, 1, 1, 1
2) 1, 1, 2 
3) 1, 2, 1 
4) 2, 1, 1 
5) 2, 2
So there are 5 distinct ways to climb 4 steps. Write a function, using recursion that will produce the answer for any number of steps.
**/
class StairCase
{
	public static void main(String args[])
	{
		int steps = Integer.parseInt(args[0]);
		System.out.println("Method 1 : For " + steps + " there are " + getSteps(steps) + " number of ways");
		System.out.println("Method 2 : For " + steps + " there are " + getStepsMethod2(steps) + " number of ways");
		System.out.println("Method 3 : For " + steps + " there are " + getStepsMethod3(steps) + " number of ways");
	}
	
	public static int getSteps(int n)
	{
		if(n <= 1) return 1;
		else
			return getSteps(n - 1) + getSteps(n - 2);
	}
	
	public static int getStepsMethod2(int n)
	{
		int a = 0, b = 1, c = 0;
		for(int i = 0; i < n; i++)
		{
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	
	public static int getStepsMethod3(int n)
	{
		int a = 0, b = 1, c = 0;
		int i = 0;
		while(i < n)
		{
			c = a + b;
			a = b;
			b = c;
			i++;
		}
		return c;
	}
}