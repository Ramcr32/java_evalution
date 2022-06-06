package _2.Q;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no of students:");
		int no= sc.nextInt();
		
		Student[] array = new Student[no];
		double sum =0;
		
		for(int i=0; i<no; i++) {
			System.out.println("student name:");
			array[i] = new Student();
			array[i].setName(sc.next());;
			System.out.println("student roll:");
			array[i].setRoll(sc.nextInt());;
			System.out.println("student address:");
			array[i].setAddress(sc.next());;
			System.out.println("student marks:");
			array[i].setMarks(sc.nextInt());;
			System.out.println(array[i]);
			sum+=array[i].getMarks();
		}
		System.out.println("average "+sum/no);
		
		
		 
		
	}
}
