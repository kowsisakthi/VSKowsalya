package AutoBox;

public class StringClass {
	public static void main(String[] args) {
		String name="KowsalyaSakthivel";
		System.out.println("The length is:"+name.length());
		String name1= "hello";
		System.out.println("The Cancat is:"+name1.concat("World"));
	  String name3= name1.concat("Everyone");
	  System.out.println(name3);
		System.out.println("The substring is::"+name.substring(7));
		if(name3.contains(name1))
		{
			System.out.println("The replace method is::"+name1.replace("hello","hii"));
		}
		String a="kowsi";
		String b="kowsi";
		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));
		
	}

}
