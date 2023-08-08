package AssignemntWeek3;

public class Fibonacci_Demo extends Fib {
	public static void main(String[] args) {
		Fib f= new Fib();
		System.out.printf(n1+" "+n2+" ");
		//System.out.println();
		f.get(n);
		
	}
	
}
class Fib{
	static int n=5,n1=0,n2=1,n3=0;
	public void get(int n) {
//		n1=0;
//		n2=1;
//		n3=0;
		for(int i=0; i<n;i++) {
			n3= n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		if(n==0)
		{
			System.exit(0);
		}
		get(--n);
		
	}
}
