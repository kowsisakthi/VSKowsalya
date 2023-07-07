package Open_Program;
import java.util.*;
public class FloydTriangla {
	public static void main(String[]args)
	{
		int counter,j;
		int value=1;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the row value:");
		int number= input.nextInt();
		for ( counter = 1 ; counter <= number ; counter++ ) 
		{ 
		for ( j = 1 ; j <= counter ; j++ ) 
		{ 
		System.out.print(value+" "); 
		value++; 
		} 
		System.out.println(); 
		}
	}

}
