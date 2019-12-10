
public class Employee {
	
	public int baseHours = 40;
	public double baseSalary = 40000.00;
	public int baseVacationDay = 10;
	public String vacationForm = "White";
	public int getBaseHours() {
		return baseHours;
	}
	
	
	//getter and setter
	public void setBaseHours(int baseHours) {
		this.baseHours = baseHours;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public int getBaseVacationDay() {
		return baseVacationDay;
	}
	public void setBaseVacationDay(int baseVacationDay) {
		this.baseVacationDay = baseVacationDay;
	}


	public String getVacationForm() {
		return vacationForm;
	}


	public void setVacationForm(String vacationForm) {
		this.vacationForm = vacationForm;
	}
	
	
}
