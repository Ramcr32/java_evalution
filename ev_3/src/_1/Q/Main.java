package _1.Q;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter number of element in the array");
			int n = sc.nextInt();
			System.out.println("Enter the elements in the array");
			int[] array = new int[n];
			for(int i=0; i<n; i++) {
				array[i] = sc.nextInt();
				
			}
			System.out.println("Enter the index of the array element you want to access");
			int index = sc.nextInt();
			System.out.println(array[index]);

		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		
	}

}
