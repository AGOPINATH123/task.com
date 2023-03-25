package task.com;

public class ObjectClassPractice {

	public static void main(String[] args) {

		
		Child obj1 = new Child();
	    Parent obj2=new Parent();
        obj1.m2(33.6f, 25.3f);
        obj2.m2(2.33,3.66);
		Child.m1(2.20f,3.25f);
		Parent.m1(25,56);
		
		System.out.println("THE VALUE OF a1 FROM PARENT CLASS IS: "+obj2.a1);
		System.out.println("THE VALUE OF a2 FROM PARENT CLASS IS: "+obj2.a2);
		System.out.println("THE VALUE OFc=a1+a2 FROM PARENT CLASS IS: "+obj2.c+"\n");
		
		System.out.println("THE VALUE OF f3 FROM CHILD CLASS IS: "+obj1.f3);
		System.out.println("THE VALUE OF f4 FROM CHILD CLASS IS: "+obj1.f4);
		System.out.println("THE VALUE OF f5 FROM CHILD CLASS IS: "+obj1.f5);

	
	}

}
