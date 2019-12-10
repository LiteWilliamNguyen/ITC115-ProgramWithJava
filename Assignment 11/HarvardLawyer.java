
public class HarvardLawyer extends Employee{
	
	public HarvardLawyer() {
		setBaseHours(40);
		setBaseSalary(50000);
		setBaseVacationDay(13);
	}
	
	public String getVacationForm() {
		vacationForm = "pink";
		return vacationForm;
	}
	public double getBaseSalary() {
		double salary = super.getBaseSalary();
		return 1.2 * salary;
	}
}
