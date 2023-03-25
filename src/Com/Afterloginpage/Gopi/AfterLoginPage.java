 package Com.Afterloginpage.Gopi;

import java.util.Random;
import java.util.Scanner;

import Com.Gopi.EntrencePage.DetailsPage;
import Com.Gopi.NextPage.EntryPage;

public class AfterLoginPage {  
	static Random ran=new Random();
	String alphabet="abcdefghijklmnopqrstuvwxyz";
	          static Scanner sc=new Scanner(System.in);
	static DetailsPage vs=new DetailsPage();	        
	static AfterLoginPage hj=new AfterLoginPage();
	static EntryPage gff=new EntryPage();
	public static  void AfterLogin(String name) {	
		
		System.out.println();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"
				+ "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
		System.out.printf("Hello *%s* welcome to the \"GFINITY CITY MALL\"\n",name);
		System.out.println("CLICK ON..");
		System.out.println("1.MOVIES \n2.SHOPPING \n3.RESTURENTS \n4.KIDS ZONE\n");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"
				+ "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");	
		int asa =sc.nextInt();
		if(asa==1) Movies();		
	}
	public static void Movies() {
		int cost=200;		
		System.out.println("Latest 2023......Plese click on Movie To Watch");
		System.out.println("1.SIR. \n2.VBVK. \n3.RRR. \n4.PUSHPA");
		int num=sc.nextInt();
		if(num==1 || num==2 ||num==3 || num==4 ) {
		switch (num) {
		case 1:
			System.out.println("Book now for *SIR MOVIE* ");
			System.out.println("Each ticket cost is *200/-*");
			System.out.println("No of seats required");
			int n=sc.nextInt();
			int []av=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter seats number"+(i+1));
				av[i] =sc.nextInt();				
			}
			System.out.println("Here are YourSeats**");
			for(int g:av) {
				System.out.print("K-"+g+" ");
			}
			System.out.println("/nTotal sum is : "+cost*n+"/-");
			
			System.out.println("Enjoy the Movie$$");
			break;
		case 2:
			System.out.println("Book now for *VBVK MOVIE* ");
			System.out.println("Each ticket cost is *200/-*");
			System.out.println("No of seats required");
			int n1=sc.nextInt();
			int []av1=new int[n1];
			for(int i=0;i<n1;i++) {
				System.out.println("Enter seats number "+(i+1));
				av1[i] =sc.nextInt();				
			}
			System.out.println("Here are YourSeats**");
			for(int g:av1) {
				System.out.print("G-"+g+" ");
			}
			System.out.println("\nTotal sum is : "+cost*n1+"/-");
			
			System.out.println("Enjoy the Movie$$");
			break;
		case 3:
			System.out.println("Book now for *RRR MOVIE* ");
			System.out.println("Each ticket cost is *200/-*");
			System.out.println("No of seats required");
			int n2=sc.nextInt();
			int []av2=new int[n2];
			for(int i=0;i<n2;i++) {
				System.out.println("Enter seats number "+(i+1));
				av2[i] =sc.nextInt();				
			}
			System.out.println("Here are YourSeats**");
			for(int g:av2) {
				System.out.print("B-"+g+" ");
			}
			System.out.println("\nTotal sum is : "+cost*n2+"/-");
			
			System.out.println("Enjoy the Movie$$");
			break;
		case 4:
			System.out.println("Book now for *PUSHPA MOVIE* ");
			System.out.println("Each ticket cost is *200/-*");
			System.out.println("No of seats required");
			int n3=sc.nextInt();
			int []av3=new int[n3];
			for(int i=0;i<n3;i++) {
				System.out.println("Enter seats number "+(i+1));
				av3[i] =sc.nextInt();				
			}
			System.out.println("Here are YourSeats**\nA");
			for(int g:av3) {
				System.out.print("A-"+g+" ");
			}
			System.out.println("\nTotal sum is : "+cost*n3+"/-");
			
			System.out.println("Enjoy the Movie$$");
			break;
			default :System.out.println();
			
		}
		}
		else System.out.println("Enter valid input##");
		
		
			
	}
	


}
