package Shape;

public class Circle extends Shape {

	@Override
	public double calculateArea(double pi, double rad) {
		return 2*pi*rad*rad;
	}

}
