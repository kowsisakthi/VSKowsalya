package Shape;

public class Shapemain {
	public static void main(String[] args) {
		Rectangel r= new Rectangel();
		System.out.println("The Rectangel area is:"+r.calculateArea(9, 8));
		Circle c= new Circle();
		System.out.println("The Circle area is:"+c.calculateArea(3.14, 7));
		
		
	}
}
