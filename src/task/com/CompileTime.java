package task.com;

public class CompileTime {

	void function(int i) {
		System.out.println(i);
	}
	
	void function(int i, int i1) {
		System.out.println(i+i1);
	}
	
	public static void main(String[] args) {
		CompileTime c = new CompileTime();
		
		c.function(2);
		c.function(3, 4);
		
	}
}
