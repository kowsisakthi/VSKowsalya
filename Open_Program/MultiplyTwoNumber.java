package Open_Program;
import java.util.*;

public class MultiplyTwoNumber {
	public static void main (String[]args) 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int firstNumber=input.nextInt();
		System.out.println("Enter the Second Number");
		int SecondNumber=input.nextInt();
		int multiply=firstNumber*SecondNumber;
		System.out.println("The Multiply the number is:"+multiply);
	}

}
