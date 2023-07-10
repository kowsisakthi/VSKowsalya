package AssignmentCoreJava;
import java.util.*;
public class CollectionMethod  extends Collection{
	
	static LinkedHashMap l2=new LinkedHashMap();
	static{
		LinkedHashMap l1=new LinkedHashMap();
		l1.put("id", "1");
		l1.put("name","kmaal");
		l1.put("age","24");
		l1.put("desigation","kk");
		l1.put("salary","1234");
		l2.put(1,l1);
	}
	
	
	static void AddanStudent() 
	{	
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the name:");
		String name= input.next();
		System.out.println("Enter the Age:");
		int age= input.nextInt();
		System.out.println("Enter the designation:");
		String desigation= input.next();
		System.out.println("Enter the Salary:");
		double salary= input.nextDouble();
		System.out.println("Enter the Id:");
		int id = input.nextInt();
		LinkedHashMap l1=new LinkedHashMap();
		l1.put("id", id);
		l1.put("name",name);
		l1.put("age",age);
		l1.put("desigation",desigation);
		l1.put("salary",salary);
		l2.put(id,l1);
	}
	static void Display()
	{
		System.out.println("Your data is:"+l2);
	
	}
	 static void Search(int id)
	 {
		 
		 System.out.println("Enter the Search id:"+l2.get(id));
	 }
	 static void Update()
	 {
		 Scanner input= new Scanner(System.in);
		 System.out.println("Enter the update name: name or age or desi or salary");
		 String name= input.next();
		 switch(name)
		 {
		 case "name":
			 updatename(); 
			 break;
		 case "age":
			 updateage();
			 break;
		 case"desi":
			 updatedesi();
			 break;
		 case "salary":
			 updatesalary();
			 break;
			 default:
				 System.out.println("Enter current value:");
			 
		 }
	 }
	 static void updatename()
	 {
		 Scanner input= new Scanner(System.in);
		 System.out.println("Enter the id:");
		 int id=input.nextInt();
		 System.out.println("Enter the name:");
		 String name=input.next();
		 LinkedHashMap l3= (LinkedHashMap) l2.get(id);
		 l3.replace("name", name);
		 
	 }
	 static void updateage()
	 {
		 Scanner input= new Scanner(System.in);
		 System.out.println("Enter the id:");
		 int id=input.nextInt();
		 System.out.println("Enter the age:");
		 int age=input.nextInt();
		 LinkedHashMap l3= (LinkedHashMap) l2.get(id);
		 l3.replace("age", age);
	 }
	 static void updatedesi()
	 {
		 Scanner input= new Scanner(System.in);
		 System.out.println("Enter the id:");
		 int id=input.nextInt();
		 System.out.println("Enter the desi:");
		 String name=input.next();
		 LinkedHashMap l3= (LinkedHashMap) l2.get(id);
		 l3.replace("desigation", name);
	 }
	 static void updatesalary()
	 {
		 Scanner input= new Scanner(System.in);
		 System.out.println("Enter the id:");
		 int id=input.nextInt();
		 System.out.println("Enter the salary:");
		 double salary=input.nextDouble();
		 LinkedHashMap l3= (LinkedHashMap) l2.get(id);
		 l3.replace("salary", salary);
	 }
	 static void Delete()
	 {
		 Scanner input= new Scanner(System.in);
		 System.out.println("Enter the id:");
		 int id=input.nextInt();
		 l2.remove(id);
	 }
}
