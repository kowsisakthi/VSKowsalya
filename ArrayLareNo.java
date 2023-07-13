package AssignmentCoreJava;

import java.util.Arrays;

public class ArrayLareNo {
	public static void main(String[] args) {
		int arry[][]= {{7,6},{9,6},{8,6},{7,5},{9,23}};
		for(int i=0;i<arry.length;i++)
		{
			//System.out.println(Arrays.toString(arry[i]));
			large(arry[i]);
		}
		
	}
 public static void large(int[]arry)
 {
	 System.out.println(Arrays.toString(arry));
	 int  i=0;
	 int j=arry.length-1;
	// System.out.println(i+""+j);
	 if(arry[i]<arry[j])
	 {
		 System.out.println("The largest number is :"+arry[j]);
	 }
	 else
	 {
		 System.out.println("The largest number is :"+arry[i]);
	 }
 }
}
