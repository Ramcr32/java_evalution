package _3.Q;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			return new HatchBack();
		}
		else {
			
			return new Sedan();
		}
	}
	public int calculateBill(Car car) {
		int totalFare;
		if(car instanceof HatchBack) {
			
			HatchBack d = (HatchBack) car;
			totalFare = d.getNumberOfKms() * d.farePerKm;
		}
		else {
			
			Sedan d= (Sedan) car;
			System.out.println( d.getNumberOfKms());
			totalFare = d.getNumberOfKms() * d.farePerKm;
		}
		
		
		
		return totalFare;
	}
}
