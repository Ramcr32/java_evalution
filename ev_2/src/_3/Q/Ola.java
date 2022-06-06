package _3.Q;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack hBack = new HatchBack();
			hBack.setNumberOfKms(numberOfKMs);
			hBack.setNumberOfPassenger(numberOfPassenger);
			
			return hBack;
		}
		else {
			Sedan sedan = new Sedan();
			sedan.setNumberOfKms(numberOfKMs);
			sedan.setNumberOfPassenger(numberOfPassenger);
			return sedan;
		}
	}
	public int calculateBill(Car car) {
		
		if(car instanceof HatchBack) {
			
			HatchBack hBack = (HatchBack) car;
			int totalFare = hBack.getNumberOfKms() * hBack.farePerKm;
			return totalFare;
		}
		else {
			
			Sedan sedan= (Sedan) car;
			
			int totalFare = sedan.getNumberOfKms() * sedan.farePerKm;
			return totalFare;
		}
		
		
		
		
	}
}
