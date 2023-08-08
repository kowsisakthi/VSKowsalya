package AssignmentWeek4;

import java.util.LinkedList;
import java.util.Scanner;

public class Import_demo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name..");
		String name= sc.next();
		System.out.println("Your name is ::"+name);
		LinkedList<String> list= new LinkedList();
		list.add("kowsi");
		list.add("kavi");
		list.add("sakthi");
		list.add("sowndhu");
		System.out.println(list);
	}

}
