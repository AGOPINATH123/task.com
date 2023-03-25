package task.com;

import java.util.Scanner;

public class ArmMethod2List {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in);
		System.out.println("ENTER THE STARTING NUMBER ");
		int StartingNum=sc.nextInt();
		System.out.println("ENTER THE ENDING NUMBER");
		int EndingNum=sc.nextInt();
		
		for(int i=StartingNum;i<=EndingNum;i++) {
			if(isArmstrong(i)) {
				System.out.println(i);
				
			}
		}
	}

	public static boolean isArmstrong(int i) {
		return true;
		// TODO Auto-generated method stub
		
	}

}
