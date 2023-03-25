package task.com;

public class RunTimePoly2 extends RuntimePoly {
	double a;
	
	public int function(double a) {
		this.a = this.a+a;
		b = b+a;
		
		return (int) (a+b);
	}
	
	public int function(double a, double b) {
		this.a = this.a+b;
		this.b = this.b+b;
		
		return(int) (a+b);
	}


}
