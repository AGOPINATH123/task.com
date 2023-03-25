package Revising;

public class SumofIntegerNumber {
	
	static int num1=12,num2=23;
	public static void CompareTwoNumbers() {
		if (num1==num2)System.out.println("num1 is euqals to num2");
		else if(num1!=num2)System.out.println("num 1 noy eqalus to num2");
		else if(num1<=num2)System.out.println("num is <= num2");
		else if(num1>=num2)System.out.println("num is >= num2");
		else System.out.println("nothing");			
	}	
	
	public  static void sumofnumber() {
		int rem,sum=0;		
	Integer g=1584254566;
	int temp=g;
	while (temp!=0) {
		rem=temp%10;
		sum =sum+rem;
		temp=temp/10;
	}
	System.out.println("the sum of integer is :"+sum);
	}
	public static void  Counting() {
		String j="yugudd@jhe 12558455 vgwj @#$%";
		int letter=0,space=0,specialChar=0,number=0;		
		char[] ch=j.toCharArray();
		for(int i=0;i<j.length();i++) {
			
		if (Character.isLetter(ch[i])) letter++;
		else if(Character.isSpace(ch[i])) space++;
		else if(Character.isDigit(ch[i]))	number++;
		else specialChar++;
		}
		System.out.println("the letter count "+letter+"; the space count "+space+"; the number"
				+ "count is  "+number+"; the special chrecter is "+specialChar);
	}
	
	

	public static void main(String[] args) {
		sumofnumber();
		CompareTwoNumbers();
		Counting();
	}

}
