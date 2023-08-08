package AssignmentWeek2;

public class Class_Printer {
	public static void main(String[] args) {
		Printer p= new Printer();
		p.print();
		p.print("this is the parameter print method...");
	}

}
class Printer{
	public void print() {
		System.out.println("this is tha print method....");
	}
	public void print(String s) {
		System.out.println(s);
	}
}