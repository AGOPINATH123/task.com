package task.com;

import java.util.Scanner;

public class AgeException {

	public static void main(String[] args) throws Age {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age ");
		
		int age = sc.nextInt();
		
		if(age<25) {
			throw new Age("not eligible");
		} else {
			System.out.println("you are eligible ");
		}
		

	}

}
