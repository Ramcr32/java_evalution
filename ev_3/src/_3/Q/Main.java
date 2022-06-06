package _3.Q;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Demo d = new Demo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("name of month:");
		String month = sc.next();
		try {
			d.showDetails(Month.valueOf(month));
		}
		catch(Exception e) {
			System.out.println("Invalid Month Name");
		}
		
	}
}
