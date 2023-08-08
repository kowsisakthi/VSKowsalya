package AssignemntWeek3;

public class Fibonicci {
	public static void main(String[] args) {
		//fib(5);
		System.out.println(fib(5));
	}
  public static  int fib(int n) {
	  if(n==1) {
		  return 0;
	  }
	  else if(n==2) {
		  return 1;
	  }
	  return fib(n-1)+fib(n-2);
  }
  
}
