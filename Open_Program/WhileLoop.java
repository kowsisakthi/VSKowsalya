package Open_Program;
import java.util.*;
public class WhileLoop {
	public static void main(String[]args)
	{
		int sum=0;
		int i=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number:");
		int number= input.nextInt();
		while(i<number)
		{
			sum=sum+number;
			i++;
			System.out.println(i);
		}
		System.out.println("The sum of the number is:"+sum);
	}

}
