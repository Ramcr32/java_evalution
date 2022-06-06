package _2.Q;

public class TemporaryEmployee extends Employee {
	
	private int hoursWorked;
	private int hourlyWages;
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages ) {
		super(employeeId, employeeName);
		this.hourlyWages = hourlyWages;
		this.hoursWorked = hoursWorked;
	}
	@Override
	public void calculateSalary() {
		setSalary(hourlyWages*hoursWorked);
		
	}
	public TemporaryEmployee() {
		
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	
}
