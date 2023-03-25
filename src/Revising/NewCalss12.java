package Revising;

import java.util.Scanner;

public class NewCalss12 {
	static Scanner in = new Scanner(System.in);
               
	public static void ScondstoHrs() {
		System.out.print("Enter seconds: ");
		int seconds = in.nextInt();
		int a = seconds % 60;
		int b = seconds / 60;
		int c = b % 60;
		b = b / 60;
		System.out.print(b + ":" + c + ":" + a);
		System.out.print("\n");
	}

public static void PrimeNumbers() {
int n=in.nextInt();
	for (int i = 1; i < 100; i++) {
		int count=0;
		for (int j = 1; j < 100; j++) {
			if(i%j==0) {
				count++;			}
			
			}
		if(count==2) {
			System.out.print(i+" ");
		}
		
	}
}
public static void SwapArray() {
	Integer []jk= {1,2,3,4,5,6,7,8,9,5,9,5,9,65,995,9,5,5959,9,9,5,10,+9,9,4,6};
	int gg=jk.length;
	int count1=0,count2=0;
	
	for (int i = 0; i < gg; i++) {
		
		if(jk[i]%2==0) { count1++;}
		else count2++;
	}
	System.out.println("even "+count1+" odd "+count2);
	Integer [] h= {1,2,3,4,5,6,7,8,9};
	System.out.println(h.length);
	 
	int temp=h[0];
    h[0]= h[h.length-1];
    h[h.length-1]=temp;     
	for (int i = 0; i < h.length; i++) {
		
		
		System.out.print(h[i]+" ");
	}
}

	public static void main(String[] args) {
		
		System.out.println("null");
		//PrimeNumbers();
		//SwapArray();
		Integer h=4;
		Integer k=6;
		System.out.println(Math.sqrt(h));
	}
}
