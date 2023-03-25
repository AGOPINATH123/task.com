package task.com;

import java.util.Scanner;

public class ScannerFORloop {

	public static void main(String[] args) {
	

		Scanner sc=new Scanner(System.in);
		System.out.println("ENETR THE NUMBER OF NAMES ");
		String []st=new String[sc.nextInt()];
	
		for(int i=0;i<st.length;i++) {
			System.out.println("ENETR THE NAME "+i);
			st [i]=sc.next();
			
			
			
		}
		System.out.println("\nENTERED NAMES LIST\n");
		
		for(String s:st) {
			System.out.println(s);
			
		}
		
		
		
		
		
	}
	

}
