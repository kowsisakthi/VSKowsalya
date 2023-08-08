package AssignmentWeek2;

public class Method_Demo {
	public static void main(String[] args) {
		School s= new School();
		s.print();
		Student st= new Student();
		st.print();
	}

}
class School{
	public void print() {
		System.out.println("This is the School class print method....");
	}
}
class Student{
	public void print() {
		System.out.println("This is the student class print method...");
	}
}
