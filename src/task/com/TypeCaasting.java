package task.com;

public class TypeCaasting {

	public static void main(String[] args) {
 int i=230;
 double h=i; //Implicit type casting
 System.out.println(h);
 System.out.println("-------------------------------");
 double m=3226556.235;
 int j=(int)m;    //explicit type casting
 System.out.println(j);
 
 
 //Wrapper class;
 Integer g=new Integer(5);
 int k=g.intValue();
 double d=k;
 System.out.println(g+" "+d);
 
 Integer m1=i;
 Integer k1=m1;
 System.out.println(k1);
 
	}

}



