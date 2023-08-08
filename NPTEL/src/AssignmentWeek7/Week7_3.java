package AssignmentWeek7;

import java.util.Scanner;

public class Week7_3 {
	public static void main(String[] args) {
		String name = "kowsalyasakthivel";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index");
		int index = sc.nextInt();
		try {
			System.out.println(name.charAt(index));
		} catch (Exception e) {
			System.out.println("Exception occur");
		}

	}
}
