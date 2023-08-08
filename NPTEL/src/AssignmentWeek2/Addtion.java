package AssignmentWeek2;

public class Addtion {
	public static void main(String[] args) {
		Sum s= new Sum();
		//s.add(10, 20);
		System.out.println(s.add(10, 20));
	}

}

class Sum{
	public String add(int a,int b) {
		int c=a+b;
		return "sum of two numbers"+c;
	}
}