package _2.Q;

public class Loan {
	private Loan() {
		
	}
	public double calculateLoanAmount(Employee employeeObj) {
		if (employeeObj instanceof permanentEmployee) {
			permanentEmployee employee = new permanentEmployee();
			return employee.getSalary()*0.15;
		}
		else {
			TemporaryEmployee employee = new TemporaryEmployee();
			return employee.getSalary()*0.10;
		}
	}
	
}
