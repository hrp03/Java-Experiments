import java.lang.String;
class ArrayOverlap
{
	public static void main(String args[])
	{
		String input[] = args;
		if(input.length > 5)
		{
			System.out.println("Enter only 5 numbers");
		}
		else
		{
			int[] array = new int[input.length];
			
			for(int i = 0; i < input.length; i++)
			{
				array[i] =  Integer.parseInt(input[i]);
			}
			
			int a = array[0];
			int b = array[1];
			int x = array[2];
			int y = array[3];
			
			int m = array[4];
			
			int c = 0;
			String num = "(";
			
			int lr1 = a > b ? (a - b) + 1 : (b - a) + 1;
			int lr2 = x > y ? (x - y) + 1 : (y - x) + 1;
			
			int[] r1 = new int[lr1];
			int[] r2 = new int[lr2];
			
			for(int i = 0; i < lr1; i++)
			{
				r1[i] = a + i;
			}
			
			for(int i = 0; i < lr2; i++)
			{
				r2[i] = x + i;
			}
			
			if(lr1 > lr2)
			{
				for(int i = 0; i < lr1; i++)
				{
					for(int j = 0; j < lr2; j++)
					{
						if(r1[i] == r2[j])
						{
							num += r1[i] + ",";
							c++;
						}
					}
				}
			}
			else
			{
				for(int i = 0; i < lr2; i++)
				{
					for(int j = 0; j < lr1; j++)
					{
						if(r2[i] == r1[j])
						{
							num += r2[i] + ",";
							c++;
						}
					}
				}
			}
			
			if(c >= m)
			{
				System.out.println("True");
				System.out.println(num.substring(0, num.length() - 1) + ")" );
			}
			else
			{
				System.out.println("False");
			}
			
			
		}
	}
}