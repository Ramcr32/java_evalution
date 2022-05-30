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
			array[i].name= sc.next();
			System.out.println("student roll:");
			array[i].roll= sc.nextInt();
			System.out.println("student address:");
			array[i].address= sc.next();
			System.out.println("student marks:");
			array[i].marks= sc.nextInt();
			System.out.println(array[i]);
			sum+=array[i].marks;
		}
		System.out.println("average "+sum/no);
		
		
		 
		
	}
}
