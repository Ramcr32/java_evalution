package _4.Q;

public class Person {
	String name;
	String gender;
	Address myAddress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getMyAddress() {
		return myAddress;
	}
	public void setMyAddress(Address myAddress) {
		this.myAddress = myAddress;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
}
