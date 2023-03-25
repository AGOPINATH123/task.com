package task.com;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int num=13568976; // contine method in java it is used to print the values wich ever given condition is thereit will leave the con
		//conditin make it continue an dthe output will be remaining elements
		
		l1:
		for (int i=1;i<=10;i++) {
			l2:
			for(int j=1;j<=10;j++) {
				if(i%j!=3) {
					continue ;
				}
				System.out.println(i+"  "+j);
			}
		}*/
		
 /*String d="what ia my name ";  //reversing the string
char c[]=d.toCharArray();
System.out.println("length of the string is " +c.length);
int count=0; 
for (int i=c.length-1;i>=0;i--) {
	System.out.print(c[i]);

}*/
		
		
	/*	
		int number=1646;
		int j=number;  ///for every number duplicate value to be created or else there will be a problem in in if condition checking. 
		
		int rem=0;
		int rev=0;
		while (number !=0) {
			
			rem=number%10;
			rev=rev*10+rem;
			number =number/10;
			
		}
	//	System.out.println(rev);
		
		if(j==rev) {
		System.out.println("THE GIVEN NUMBER IS PALINDROM");
		}
		else {
		System.out.println("NUMBER IS not PALINDEROME");
		}
		*/
		
		
		int rem=0;
		int rev=0;
		int i=0;
		
			
			while(i!=0) {
			for( i=0;i<=500;i++) {
			rem=i%10;
			rev=rev*10+rem;
			i=i/10; 
	  	
			}
			if(i==rev) {
			System.out.println(i);

			}
			else {
				System.out.println("nothing");
				
			}
			}
		}
		}
	