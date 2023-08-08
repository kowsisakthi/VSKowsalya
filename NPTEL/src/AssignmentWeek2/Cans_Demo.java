package AssignmentWeek2;

public class Cans_Demo {
	public static void main(String[] args) {
		Canstr c = new Canstr();
		Canstr c1= new Canstr("helloo....");
	}

}

class Canstr {
	public Canstr() {
		//super();
		System.out.println("this is default.....");
//		new Canstr("Hello");

	}
	public Canstr(String str) {
		System.out.println(str);
		
	}
}