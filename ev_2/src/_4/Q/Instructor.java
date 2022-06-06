package _4.Q;

public class Instructor extends Person {
	int instructor;
	int salary;
	public int getInstructor() {
		return instructor;
	}
	public void setInstructor(int instructor) {
		this.instructor = instructor;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Instructor [instructor=" + instructor + ", salary=" + salary +" ,address="+this.myAddress+ "]";
	}
	
}
