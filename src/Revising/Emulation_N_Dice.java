package Revising;

import java.util.Random;
import java.util.Scanner;

public class Emulation_N_Dice implements Runnable {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	static int IND=0;
	static int ENG=0;
	static int M;
	
	public static void India() {
	Integer[] India = new Integer[M];
	for (int i = 0; i<India.length; i++) {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ball "+i+" = "+rand.nextInt(5)+"*runs");
		India[i] = rand.nextInt(5);		
	}
	System.out.println();
	for (int j =0; j <India.length; j++) {
		IND=IND+India[j];
	}
	System.out.println("The total RUNS of Team INDIA is : "+IND);
	}
	
	public static void England() {
		Integer[] England = new Integer[M];
		for (int i = 0; i<England.length; i++) {	
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Ball "+i+" = "+rand.nextInt(5)+"*runs");
			England[i]=rand.nextInt(5);
		}
	 
		System.out.println();
		for (int j = 0; j <England.length; j++) {
			
			ENG=ENG+England[j];
		}
		System.out.println("The total score of Team ENGLAND is : "+ENG);

		}
	public static void First() {
		System.out.print("Welcome To HOTSTAR*\t\t");
		System.out.printf("%tc%n\n",System.currentTimeMillis());
		System.out.println("INDIA* vs ENGLAND* \n");		
		System.out.println();
		System.out.println("Wheather Condition check");
		System.out.println("1.Good   2.Bad   3.VeryBad");
		int d=sc.nextInt();		
		if(d==1) {		
		M=300;
		System.out.println("MATCH is Held For *50-Overs*");
		}
		else if(d==2) {	
		M=150;
		System.out.println("MATCH is Held For *25-Overs*");
		}
		else if(d==3)System.out.println("Match is stoped due to *VERYBAD WEATHER* ");
		System.out.println("Toss The Coin *0*");
		int sd=sc.nextInt();
		if(sd==0) {
		int id=rand.nextInt(2)+1;
		if(id==1) System.out.println("INDIA Wins the TOSS\nChoosen Batting**\n*TEAM INDIA* Match Starts in");
		else System.out.println("ENGLAND Wins the TOSS\nChoosen Batting***TEAM ENGLAND* Match Starts in");
		}else System.out.println("Enter *0* to TOSS");
		for (int i = 10; i>=0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(" "+i+"secs");
			if(i==0) {
				System.out.println("Match started");
			}			
		}
		if(d==1) {
			India() ;
			System.out.println("ENGLAND Match Starts in ");
			for (int i = 10; i>=0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i+"secs");
				
			}			
			England();
			}
		else England();
		System.out.println("INDIA Match Starts in ");
		for (int i = 10; i>=0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+"secs");			
		}
		India();
		System.out.println();
	}
	
	public static void main(String args[]) {
		
		First();
		
		if(IND>ENG) {
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"
					+ "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
			System.out.println("\t\t\t\t*******INDIA WON THE MATCH ********");
			System.out.println("\t\t\t\tCONGRADULATIONS **TEAM INDIA** \n");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"
					+ "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		}
		else {
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"
					+ "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
			System.out.println("\t\t\t\t********ENGLAND WON THE MATCH*******");
			System.out.println("\t\t\t\tCONGRADULATIONS **TEAM ENGLAND** \n");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"
					+ "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		}

		
		
			 

		sc.close();
	}

	@Override
	public void run() {
		
	}
}