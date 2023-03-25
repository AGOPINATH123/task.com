package Revising;

public class Fabinnoci {
	
	    static int a=0,b=1,c;
	    
        public void Fibbunoci(int i) {		
		if(i>=1) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			Fibbunoci(i-1);
		}
}
	    public static void main(String[] args) {
	    System.out.println("This is a recursion output");
		System.out.print(a+" "+b +"");	
		Fabinnoci gb=new Fabinnoci();
        gb.Fibbunoci(10);
        System.out.println();
        System.out.println("*************************************************************************");
        System.out.println( "This output usinng forloop");
    	int no=10;
    		int a=0;
    		int b=1;
    		int c;
    		System.out.print(a+" "+b+" ");
       for(int i=1;i<=no;i++) {
    		c=a+b;
    		System.out.print(c+" ");
    		a=b;
    		b=c;
    }
    
    
    
    
	}


}
