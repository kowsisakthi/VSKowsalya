package AutoBox;

public class WrapperClass {
	public static void main(String[] args) {
		int a=10;
		double d=23.3;
		float f= 400;
		System.out.println("AutoBoxing");
		Integer a1=a;
		Double d1=d;
		Float f1=f;
		System.out.println("Un Boxing");
		int a2=a1;
		double d2=d1;
		float f3=f1;
	}

}
