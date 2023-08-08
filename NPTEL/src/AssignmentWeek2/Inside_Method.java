package AssignmentWeek2;

public class Inside_Method {
public static void main(String[] args) {
	Calling ca= new Calling();
	ca.print();
}
}
class Calling{
	public void print() {
		get();
	}
	public void get() {
		System.out.println("this is inside the method...");
	}
}