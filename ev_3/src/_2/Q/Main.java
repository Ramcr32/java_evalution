package _2.Q;

public class Main {
	Loan l;
	public static void main(String[] args) {
		Main m = new Main();
		
//		1. by supplying PermanentEmployee object
		permanentEmployee emp = new permanentEmployee(001, "syam", 1000);
		
		emp.calculateSalary();
		System.out.println(m.l.calculateLoanAmount(emp));

	}

}
