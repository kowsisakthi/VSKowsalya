package AssignemntWeek3;

public class Recursion {
	public static void main(String[] args) {
		get(5);
	}
   public static void get(int a) {
	   if(a==0||a<0) {
		   System.exit(0);
	   }
	   System.out.println("hellooo..");
	   get(--a);
   }
}
