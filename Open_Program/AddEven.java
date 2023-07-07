package Open_Program;
import java.util.*;
public class AddEven {
	public static void main(String[]arga) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number= input.nextInt();
		if(number==1) {
			
			System.out.println("THIS IS NOT EVEN NUMBER OR ADD NUMBER");
			return;
			
		}
		if(number%2==0)
		{
			
			System.out.println("The Number is ADD Number:"+number);
		}
		else
		{
			
			System.out.println("The Number is EVEN nmber:"+number);
		}
		
	}

}
