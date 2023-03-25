package task.com;

import java.util.Scanner;
public class Javaexcercise {
      public static void main(String args[])
    {
        int decimalnum, quot, i=1, j;
        int bin_num[] = new int[100];
        try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter a Decimal Number : ");
			decimalnum = scan.nextInt();
		}
 
        quot = decimalnum;
 

        while(quot != 0)
        {
            bin_num[i++] = quot%2;
            quot = quot/2;
        }
 
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}
/*public class Swap {
	static Scanner sc=new Scanner(System.in);
    int a;
	int b;
	int t;

	public void Foo(int a,int b) {
	this.t=a;
	this.a=b;
	this.b=t;		
	} 
	public static void PrintAvg() {
		int num =5;
		int temp=num;
		int sum=0;
		while(temp!=0) {
			System.out.println("eenter the number ");
			 sum =sum+sc.nextInt();
			 temp=temp-1;
		}
			System.out.println(sum/num);
		}
	char h=35; 
	
		
	

	public static void main(String[] args) {
		
		/*Swap gg=new Swap();
		gg.Foo(30, 20);
		
		 System.out.println(gg.a);
		 System.out.println(gg.b);*/
	//	PrintAvg();
		
	/*	int a =30;
		int b=10;
		int t;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
	//	 t=a;
	//	 a=b;
	//	 b=t;
		// System.out.println(a);
		// System.out.println(b);*/
		
		
	