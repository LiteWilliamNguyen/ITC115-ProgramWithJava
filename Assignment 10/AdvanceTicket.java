
public class AdvanceTicket extends ticket{

		double price;
		public String type() {
			String type = "Advance Ticket";
			return type;
		}
		
		public double getPrice(int days) {
			if (days < 10) {
				price = 40;
				System.out.println("Price: $" + price);
				return price;
			}
			else price = 30;
			System.out.println("Price: $" + price);
			return price;
		}
		public String toString() {
			String item = "You are about to purchase: ";
			System.out.println(" ");
			System.out.println(item + " ticket number "+ number + ", price: $"+ price);
			return item;
		}
}
