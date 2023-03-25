package task.com;

import java.util.Scanner;

public class AmstrPractice {
	
	static boolean isAmrmStrong(int n) {
		int temp,sum=0,rem=0,len=0;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			len++;
		}
		temp=n;
		while(temp>0) {
			rem=temp%10;
			sum+=(Math.pow(rem, len));
			temp=temp/10;
		}

		if (n==sum) return true;
			
		else return false;
		
	
		
	}
	public static void main(String [] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(isAmrmStrong(num)){
			System.out.println("NUM IS ARMSTRONG");
			
		}
		else {
			System.out.println("NUM IS NOT ARMSTRONG");
		}
		
	}
}
