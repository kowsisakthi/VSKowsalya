package Open_Program;
import java.util.*;
public class SwitchCase {
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		int number=input.nextInt();
		switch(number) {
		case 1:
			System.out.println("java");
			break;
		case 2:
			System.out.println("Dotnet");
			break;
		case 3:
			System.out.println("python");
			break;
			default:
				System.out.println("pleace provide current value");
		}
			
	}

}
