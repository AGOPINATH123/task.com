package task.com;

import java.util.Scanner;

public class Scannerex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of elements: ");
		
		String[] str = new String[sc.nextInt()];
		
		sc.nextLine();
		
		for (int i = 0; i<str.length; i++) {
			str[i] = sc.nextLine();
		}
		
		System.out.println("entered elements");
		
		for (String s: str) {
			System.out.println(str);
		}
		
	}

}
