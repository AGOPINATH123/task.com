package task.com;

public class Exceptionex1 {
	
	int k;
	
	int[] arry = new int[2];
	
	String str;
	
	void function() {
		try {
		k = 1/k;       // no value arthmatic
		arry[2]=5;     // index out of bound 
		char ch = str.charAt(0);   // null pointer 
	} catch(Exception e) {
		System.out.println("exception");
	}
		}

	public static void main(String[] args) {
		Exceptionex1 ee = new Exceptionex1();
		
		ee.function();

	}

}
