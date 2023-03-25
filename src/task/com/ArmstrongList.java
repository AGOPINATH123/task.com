package task.com;

public class ArmstrongList {

	public static void main(String[] args) {
		 int n, count = 0, a, b, c, sum = 0;
		// int digitcount = String.valueOf(num).length();
		 //the above line is used in sum=sum+(Math.pow(rem,digitcount));
	
		
		int i=1;
		for( i=1;i<=1000;i++) {
			n=i;
		while(n>0) {
			b=n%10;
			sum=sum+(b*b*b);
			n=n/10;
			
			
		}
		if(sum==i) {
			System.out.println(i+" ");
		}
		
				sum=0;
			
	
		}
		
	}
	}