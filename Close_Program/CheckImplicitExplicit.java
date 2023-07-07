package Close_Program;

public class CheckImplicitExplicit {
	public static void main(String[]args)
	{
		int a=10;
	
	String i=String.valueOf(a);
	System.out.println(i);
	
	float f= a;
	System.out.println("float:"+f);
	
	double d=a;
	System.out.println("double:"+d);
	
	//byte b=a;
	//byte c= (byte)b;
	char c=(char)a;
	System.out.println("char:"+c);
	
	
	String s="name";
	
	char[]c1=s.toCharArray();
	System.out.println("string char:"+c1);
	
	
	char ch='z';
	int result=(char)ch;
	System.out.println("char to int:"+result);
	
	
	}

}
