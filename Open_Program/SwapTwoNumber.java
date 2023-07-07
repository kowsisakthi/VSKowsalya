package Open_Program;
import java.util.*;
public class SwapTwoNumber {
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber=input.nextInt();
		System.out.println("Enter the second number");
		int secondNumber=input.nextInt();
		System.out.println("Before swape the number is :"+firstNumber);
		System.out.println("Before swape the number is :"+secondNumber);
		
		int temp=firstNumber;
		firstNumber=secondNumber;
		secondNumber=temp;
		
		System.out.println("After swape the number is :"+firstNumber);
		System.out.println("After swape the number is :"+secondNumber);
	}

}
