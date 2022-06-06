package _3.Q;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("number of passengers:");
		int numberOfPassenger=sc.nextInt();
		
		System.out.println("number of kms:");
		int numberOfKms = sc.nextInt();
		
		
		Ola myOla = new Ola();
		
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms );
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is "+ res);
		
		
	}
}
