package AssignmentWeek4;

public class Main_InterFace implements ExtraLarge{
	public static void main(String[] args) {
	Large s=new Small();
	s.print();
	Main_InterFace face = new Main_InterFace();
	face.display();
		
	}

	@Override
	public   void display() {
		System.out.println("this is main");
	}

}
