package task.com;

public class RuntimePoly {
	
	double a, b;
	static int x,y;
	
	public int function(double a) {
		this.a = this.a+a;
		b = b+a;
		
		return (int) a;
	}
	
	public double function(int x, int y) {
		RuntimePoly.x = RuntimePoly.x+x;
		RuntimePoly.y = RuntimePoly.y+y;
		
		return(double) (x+y);
	}

}
