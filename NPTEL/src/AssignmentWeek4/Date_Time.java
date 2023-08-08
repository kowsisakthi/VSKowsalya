package AssignmentWeek4;

public class Date_Time {
	public static void main(String[] args) {
		int year;
		java.util.Calendar current;
		current=java.util.Calendar.getInstance();
		year=current.get(java.util.Calendar.YEAR);
		System.out.println("The current year::"+year);
	}

}
