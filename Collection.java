package AssignmentCoreJava;
import java.util.*;
public class Collection {
	static Scanner input1= new Scanner(System.in);
	CollectionMethod a1 = new CollectionMethod();
	static String name;
	static void enter() {
		System.out.println("Enter the option: Add or Display or Search or Update or Delete or exit");
		 name= input1.next();
	}
	
	public static void main(String[]args) {
	
		enter();
		while(name!=null) {
			switch(name)
			{
			case "Add":
				CollectionMethod.AddanStudent();
				enter();
				break;
			case "Display":
				CollectionMethod.Display();
				enter();
				break;
			case "Search":
				System.out.println("Enter the id for search:");
				int id1= input1.nextInt();
				CollectionMethod.Search(id1);
				enter();
				break;
			case "Update":
				CollectionMethod.Update();
				enter();
				break;
			case "Delete":
				CollectionMethod.Delete();
				enter();
				break;
				
			case "exit" :name = null;
				break;
			
			}
		}
		
		
		
	}

	
}
