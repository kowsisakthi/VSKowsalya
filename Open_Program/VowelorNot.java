package Open_Program;
import java.util.*;
public class VowelorNot {
	public static void main(String []args) {
	
		Scanner input = new Scanner(System.in);
	try {	
		
		System.out.println("Enter the String value");
		String name= input.next();
		
		for(int i=0;i<=name.length();i++)
		{
			char name1=name.charAt(i);
			
			if(name1=='a' || name1=='e'|| name1=='i'|| name1=='o'|| name1=='q')
			{
				//System.out.println(name);
				System.out.println("This is the vowels:"+name1);
			}
			else 
			{
				//System.out.println(name);
				System.out.println("This is not vowel:"+name1);
			}
				
			}
			
	}
	catch(Exception ex) {
		
		
	
	}

		
		
	}
	}


