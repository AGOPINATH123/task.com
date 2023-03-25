package task.com;

public class Child extends Parent {
 float f3,f4,f5;

		// This method hides m1() in Parent
		static void m1(float f1,float f2)
		{
			float F7=f1+f2;
			System.out.println("THESE ARE THE VALUES FROM CHILD CLASS M1();");
			System.out.println("THE VALUE OS f1 IS: "+f1);
			System.out.println("THE VALUE OS f2 IS: "+f2);
			System.out.println("THE VALUE OS F7 IS: "+ F7+"\n");
		}

		// This method overrides m2() in Parent
		public void m2(float f3,float f4)
		{
			
			this.f3=f3;
			this.f4=f4;
			 f5=f3+f4;
			
			//stem.out.println("From child "
						// "non-static(instance) m2()");
		}
	}


