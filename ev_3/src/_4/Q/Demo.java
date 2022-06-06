package _4.Q;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("user name: ");
		String name = sc.next();
		System.out.println("password: ");
		String pass = sc.next();
		System.out.println("mobile number: ");
		String mobile = sc.next();
		System.out.println("email: ");
		String email = sc.next();
		try {
			
			if(Pattern.matches("[A-Za-z]{3,8}", name)&& 
					Pattern.matches("[A-Za-z0-9]{3,8}", pass) &&
					Pattern.matches("[6789][0-9]{9}",mobile) &&
					Pattern.matches("[A-Za-z0-9]", email)) {
				Customer customer = new Customer(name, pass, mobile, email);
				System.out.println(customer);
			}
			else {
				System.out.println("invalid input");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
