package _2.Q;

public class permanentEmployee extends Employee {
	private double basicPay;
	public permanentEmployee(int employeeId, String employeeName,double basicPay) {
		super(employeeId, employeeName);
		this.basicPay= basicPay;
	}


	public permanentEmployee() {
		
	}


	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}


	double pfAmount = basicPay*0.12;
	@Override
	public void calculateSalary() {
		setSalary(basicPay-pfAmount);
		
	}

}
