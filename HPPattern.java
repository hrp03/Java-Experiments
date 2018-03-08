/*
Generate Pattern Like (if n = 5)

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1

*/

import java.io.*;
import java.lang.*;

class HPPattern
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the string");
		
		int n = Integer.parseInt(br.readLine());
		int m = n;
		for(int i = 1; i <= n; i++)
		{
			System.out.println("");
			int s = n - i;
			for(int j = 1; j <= s; j++)
			{
				System.out.print("  ");
			}

			int x = (n - m) + 1;
			
			for(int j = x; j >= 1; j--)
			{
				System.out.print(j + " ");
			}
			
			for(int j = 2; j <= x; j++)
			{
				System.out.print(j + " ");
			}
			m--;	
		}
		m = n;
		for(int i = n; i >= 1; i--)
		{
			System.out.println("");
			int s = m - n;
			
			for(int j = 0; j <= s; j++)
			{
				System.out.print("  ");
			}
			
			int x = n - 1;
			
			for(int j = x; j >= 1; j--)
			{
				System.out.print(j + " ");
			}
			
			for(int j = 2; j <= x; j++)
			{
				System.out.print(j + " ");
			}
			n--;			
		}
	}
}
