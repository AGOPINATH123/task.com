package task.com;

public class Parent {
	double a1,c, a2;
	int a,b;

		static void m1(int a,int b)
		{
			a=a+b;
			b=a-b;
			System.out.println("THESE ARE THE VALUES FROM PARENT CLASS M1();");
			System.out.println("THE VALUE OF a IS : "+a);
			System.out.println("THE VALUE OF b IS : "+b+"\n");
		
		}

	
		public void m2(double a1,double a2)
		{
			this.a1=a1;
		    this.a2=a2;
			 c=a1+a2;
			
		//	System.out.println("From parent "
					//		+ "non-static(instance) m2()");
		}
	}



