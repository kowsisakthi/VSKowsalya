package Close_Program;

public class TwoDimensel {
	public static void main(String[]args)
	{
		int count=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------");
		int c=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
