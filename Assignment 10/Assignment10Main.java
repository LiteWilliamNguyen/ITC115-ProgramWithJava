
public class Assignment10Main {

	public static void main(String[] args) {
		
		System.out.println("Ticket");
		ticket one = new ticket();
		one.number();
		one.getPrice(1);
		one.toString();
		System.out.println();
		
		System.out.println("Advance Ticket");
		AdvanceTicket two = new AdvanceTicket ();
		two.number();
		two.getPrice(2);
		two.toString();
		System.out.println();
		
		System.out.println("Student Advance Ticket");
		StudentAdvanceTicket three = new StudentAdvanceTicket();
		three.number();
		three.getPrice(15);
		three.toString();
	}

	
}
