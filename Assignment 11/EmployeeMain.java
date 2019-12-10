
public class EmployeeMain {

	public static void main(String[] args) {
		
		Janitor j = new Janitor();
		System.out.println("Janitor Salary: " + j.getBaseSalary());
		System.out.println("Janitor vacation day: " + j.getBaseVacationDay());
		System.out.println("Janitor fills out "+ j.vacationForm + " form for vacation application");
		j.clean();
		
		System.out.println();
		
		HarvardLawyer h = new HarvardLawyer();
		System.out.println("Harvard Lawyer salary: "+ h.getBaseSalary());
		System.out.println("Harvard Lawyer vacation day: " + h.getBaseVacationDay());
		System.out.println("Harvard Lawyer fills out " + h.getVacationForm() + " form for vacation application");
		

	}

}
