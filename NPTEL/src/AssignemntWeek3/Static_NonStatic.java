package AssignemntWeek3;

public class Static_NonStatic {
	public static void main(String[] args) {
		Maths m= new Maths();
		m.add(5, 8);
		Maths.product(10, 10);
	}
	
	

}
class Maths{
	public int add(int a,int b) {
		int c;
		c=a+b;
		System.out.println("the sum of the number is:"+c); 
		return c;
		
	}
	public static int product(int a,int b) {
		int c;
		c=a*b;
		System.out.println("the mutiple of the number is:"+c); 
		return c;
	}
}