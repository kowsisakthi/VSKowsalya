package AssignmentCoreJava;
import java.util.*;
public class ArithmeticOperation {
	
	public double Addition(double number1,double number2) 
	{
		double sum= number1+number2;
		System.out.println("The sum of the number is:"+sum);
		return sum;
		
		
		
	}
	public double Subtraction(double number1,double number2)
	{
		double difference= number1-number2;
		System.out.println("The difference of the number is:"+difference);
		return difference;
	}
	public double Multiplication(double number1,double number2)
	{
		double multiple= number1*number2;
		System.out.println("The multiple of the number is:"+multiple);
		return multiple;
		
		
		
	}
	public double Division(double number1,double number2)
	{
		double div=number1/number2;
		System.out.println("The division value is:"+div);
		return div;
	}
	

	public double PowerCalculation(double number1,double number2)
	{
		double power = 1;  
		for (int i = 1; i <= number1; i++)   
		power = power * number2;
		System.out.println("The power value is :"+power);
		return power;  
		
	}
	

	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the First Number");
		double number1= input.nextInt();
		System.out.println("Enter the Second Number");
		double number2=input.nextInt();
		
		ArithmeticOperation arthamatic= new ArithmeticOperation();
		arthamatic.Addition(number1,number2);
		arthamatic.Subtraction(number1,number2);
		arthamatic.Multiplication(number1,number2);
		arthamatic.PowerCalculation(number1,number2);
		arthamatic.Division(number1,number2);
		
	}
}
