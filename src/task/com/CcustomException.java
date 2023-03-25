package task.com;

import java.util.Scanner;

    class prob extends Exception{
	
	private static final long serialVersionUID = 1L;

	public prob(String str) {
		System.out.println("PLEASE ENTER VALID USERID");
	}}
	class gop1 extends Exception{
	public gop1(String str) {
	System.out.println("PLEASE ENTER VALID PASSWORD");
		}	}
    public class CcustomException {
	String g="ABCD@GMAIL.COM";
	public static void main(String[] args) throws prob, gop1 {
    Scanner sc =new Scanner(System.in);
    System.out.println("USER NAME = "+"ABCD@");
    System.out.println("PASSWORD = "+"pass\n");
    
    System.out.println("Enter login details");
    System.out.println("enter User id");
    String s=sc.next();
    try {
    if (!s.equals("ABCD@")) {
    	throw new prob("PLEASE ENTER A VALID USER ID");
    }
    else {
    	System.out.println("ENTER PASSWORD");
    }}
      catch(prob b) {
    	  System.out.println(b);
    	
    }
    String d=sc.next();
    if(!d.equalsIgnoreCase("pass")) {
    	throw new gop1("invalid");
       }
    else {
    	System.out.println("WECOME TO JAVA");
    }
	}

}
