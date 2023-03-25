package task.com;

import java.util.Scanner;

public class AmMethod2 {

	public static void main(String[] args) {
		
           Scanner sc= new Scanner(System.in);
           System.out.println("enter the number");
           int num=sc.nextInt();
	       int digitcount = String.valueOf(num).length();

           int n=num;
           						// int temp=1;
           int len=0,rem,sum=0;																		//THIS METHOD IS TO FIND LENGTH OF NUMBER;
         				/* while(temp<=n) {
	                                           										temp=temp*10;
	                                           										len++;
                                               										}*/
 while(n!=0) {
	 rem=n%10;
     sum+=(Math.pow(rem,digitcount));
     n=n/10;
 }
	 
 if(sum==num) {
	 System.out.println("THE ENTERED NUMBER IS AMSTRONG");
 }
 else {
	 System.out.println("THE GIVEN NUMBER IS NOT AMSTRONG");
 }
		
	
		
		
	}

}
