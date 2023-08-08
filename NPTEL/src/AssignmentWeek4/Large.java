package AssignmentWeek4;

public class Large {
	public void print() {
		System.out.println("this is the large ");
	}
}
class Medium extends Large{
	
	public void print() {
		System.out.println("this is Medium");
		super.print();
	}
}
class Small extends Medium{
	public void print() {
		System.out.println("this is small");
		super.print();
	}
}