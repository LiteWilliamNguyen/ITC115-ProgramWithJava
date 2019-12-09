
public class ticket {

		public int number;
		public double price;
		public String type;
		
		public int number() {
			int number = 0;
			for (int i = 0; i < 500; i++) {
				i ++;
				number =  i;
				System.out.println("Ticket Number:  "+ i);
				
			}
			return number;
		}
				
		
		public double getPrice(int days) {
			System.out.println("Ticket Price: $50");
			return price;
		}
		
		
		
		
		public String toString(){
			String item = "You are about to purchase: ";
			System.out.println(" ");
			System.out.println(item + " ticket number "+ number + ", price: $"+ price);
			return item;
	}

		// setter and getter
		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}
}
