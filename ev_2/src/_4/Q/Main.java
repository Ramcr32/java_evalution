package _4.Q;

public class Main {
	public static Person generatePerson(Person person) {
		if(person instanceof Student) {
			Student myStudent =(Student) person;
			myStudent.setName("kishor");
			myStudent.setCourseEnrolled("fw");
			myStudent.setCourseFee(2012);
			myStudent.setGender("male");
//			myStudent.setStudentId(01);
			((Student) person).setStudentId(50);
			Address address = new Address();
			address.city="raipur";
			address.pinCode="454";
			address.state="chhattisgarh";
			myStudent.setMyAddress(address);
			return myStudent;
			
		}
		else {
			Instructor myInstructor = (Instructor) person;
			myInstructor.setGender("female");
			myInstructor.setName("ramu");
			myInstructor.setSalary(562154);
			myInstructor.setInstructor(5);
			Address address = new Address();
			address.city="bilaspur";
			address.pinCode="454998";
			address.state="chhattisgarh";
			myInstructor.setMyAddress(address);
			return myInstructor;
		}
		
	}
	public static void main(String[] args) {

		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());
		
		
		
		System.out.println(newStudent);
		System.out.println(newTeacher);
		}
}
