package _3.Q;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		Scanner sc = new Scanner(System.in);
		System.out.println("number of passengers:");
		int numberOfPassenger=sc.nextInt();
		car.setNumberOfPassenger(numberOfPassenger);
		System.out.println("number of kms:");
		int numberOfKms = sc.nextInt();
		car.setNumberOfKms(numberOfKms);
		
		Ola myOla = new Ola();
		
		Car myCar = myOla.bookCar(car.getNumberOfPassenger(),car.getNumberOfKms() );
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is "+ res);
	}
}
