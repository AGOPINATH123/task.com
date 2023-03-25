package task.com;

public class Parent1abs extends Abstracrty {
int x,y,z,g;

		@Override
		void function(int a, int b, int c) {
			 this.x=a+b+c;
			 this. z=a-b-c;
		}

		@Override
		void function1(int d, int f, int h) {
			this. y=d+f+h;
		}

		@Override
		void function2(int i, int j, int k) {
			this. g=i*j*k;
		}
	
        public static void main (String args[]) {
        	Parent1abs s=new Parent1abs(); 	
            s.function(12, 25, 56);
			s.function1(56, 250, 360);
			s.function2(589,253,565);
			
			System.out.println(s.x);
			System.out.println(s.y);
			System.out.println(s.g);
			System.out.println(s.z);

		}
}
