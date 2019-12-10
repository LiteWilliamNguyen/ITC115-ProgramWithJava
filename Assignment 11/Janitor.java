
public class Janitor extends Employee{
	
	public void clean() {
		System.out.println("Workin' for the man.");
	}
	
	public Janitor() {
		super();
		setBaseHours(80);
		setBaseSalary(30000);
		setBaseVacationDay(5);
		
	}
	
	
	
}
