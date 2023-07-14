package CoreJavaAssignment2;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("First display the  peron class");
		Persons p= new Persons();
		
		p.setName("kowsalyasakthivel");
		p.setAge(23);
		p.setAddress("palani");
		
		System.out.println("Name is:"+p.getName());
		System.out.println("Age is:"+p.getAge());
		System.out.println("Address is:"+p.getAddress());
		System.out.println("-------------------------------------------------");
		
		System.out.println(" Pass the argument and  display the  peron class ");
		System.out.println("-------------------------------------------------");
		
		Persons p1= new Persons("sakthivel",43,"madurai");
		
		System.out.println("Name is:"+p1.getName());
		System.out.println("Age is:"+p1.getAge());
		System.out.println("Address is:"+p1.getAddress());
		System.out.println("-------------------------------------------------");
		
		System.out.println(" display the  employee class ");
		System.out.println("-------------------------------------------------");
		
		
		Employee e1= new Employee("MANI",20,"PALANI",2,20000);
		//e1.toString();
		System.out.println("Name is:"+e1.getName());
		System.out.println("Age is:"+e1.getAge());
		System.out.println("Address is:"+e1.getAddress());
		System.out.println("Employee ID is:"+e1.getEmployeeId());
		System.out.println("Salary:"+e1.getSalary());
		System.out.println("-------------------------------------------------");
		System.out.println(e1.toString());
		
		Persons p2= new Persons();
		
		Persons p3= new Persons("kavi",5,"kani");
		Persons p4= new Persons();
		Persons p5= new Persons("kalai", 6,"plani");
		Persons p6= new Persons();
		System.out.println("the total number of object in person:"+Persons.count);
		
		
	}

}
