
public class StudentAdvanceTicket extends ticket {
	double price;
	
	public String type() {
		String type = "Students Advance Ticket";
		return type;
	}
	
	public double getPrice(int days) {
		if (days < 10) {
			price = 20;
			System.out.println("Ticket Price: $" + price);
		}
		else price = 15;
		System.out.println("Ticket Price: $" + price);
		return price;
	}
	
	public String toString() {
		String item = "You are about to purchase: ";
		System.out.println(" ");
		System.out.println(item + " ticket number "+ number + ", price: $"+ price);
		return item;
	}
	
}
