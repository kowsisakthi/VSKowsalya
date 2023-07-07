package Open_Program;
import java.util.*;

public class QuotientRemainder {
	public static void main(String[]args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the FirstNumber:");
		int firstNumber= input.nextInt();
		System.out.println("Enter The SecondNumber:");
		int secondNumber= input.nextInt();
		
		int quotient=firstNumber/secondNumber;
		int remainder=firstNumber%secondNumber;
		System.out.println("The QuotientValue is:"+quotient);
		System.out.println("The RemainderValue is:"+remainder);
		
		
	}

}
