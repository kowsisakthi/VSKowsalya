package Close_Program;

import java.util.Arrays;

public class Array {
	public static void main(String[]args)
	{
		int[]a=new int[5];
		a[0]=3;
		a[1]=7;
		a[2]=6;
		a[3]=4;
		a[4]=5;
		for(int i=0; i<a.length;i++)
		{
			
			System.out.println("array before sorting:"+a[i]);
		}
	
		Arrays.sort(a);
		System.out.println("array after sorting:"+ Arrays.toString(a));	
		
	}
	
	

}

