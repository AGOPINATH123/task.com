package Revising;

import java.util.Scanner;

class Vertigo extends Exception{
public Vertigo(String str){
	System.out.println(str);
}
}
public class ManualException{

public static void main(String[] args) throws Vertigo {
Scanner sc=new Scanner(System.in);
int n=200;
System.out.println("Enter the number");
int s=sc.nextInt();
try {
if(s==0) throw new Vertigo("excetion raised cant devide with zero");

else System.out.println(n/s);
}
catch(Exception h) {
	System.out.println(h);
	
}
}

}