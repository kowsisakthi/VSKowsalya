package Close_Program;
import java.util.*;
public class AvargeNumber {
	public double number() {
		
		double avr = 0;
	    int j=1;
	   int sum=0;
		ArrayList<Integer> al = new ArrayList<Integer>(5);
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		while(j<=5) {
		
			
			int a=input.nextInt();
			input.nextLine();
			al.add(a);
			System.out.println(al);
			j++;
			
			
		}
	
		
		for(int i1=0; i1<al.size();i1++)
		{
			sum+=al.get(i1);
			avr=sum/5;
		}
	System.out.println("the sum of the number is:"+sum);
		System.out.println("The avrage is:"+avr);
		

		return avr;
		
	
		
	}
	public static void main(String[]args) {
		
		AvargeNumber avarge= new AvargeNumber();
		avarge.number();
	}

}
