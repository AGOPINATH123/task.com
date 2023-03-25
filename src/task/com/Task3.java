package task.com;

public class Task3 {

	int x, y; // THESE VARIBLES ARE NON STATIC VATIABLES;
	static float s1, s2; // THESE ARE STATIC VARIABLES;

	public void Voop(int x, int y) {
		// THESE FUCTION IS LOCAL VARIABLES
		// BECAUSE THERE IS NO STSIC IN THE FUNCTION;
		// HERE WE HAVE TO USE THE "THIS"KEY WORD THAT MAKES THE OBJECT
		// VARIABLES INTO CURRENT VARIABLE THAT MEANES WE DEFINING VALUES WE
		// ADD NO.OF NEW OBJECTS AND ASIGN VALUES OF X AND Y TO THE CURRENT OBJECT ;
		this.x = x + y;
		this.y = x * y;
	}

	public static void Fero(float s1, float s2) {

		s1 = s1 + s2;
		System.out.println(s1);// HERE STATIC METHOD CANNOT BE PRINTED IN THE MAINN MAETHOD
		// SO I HAVE TAKEN IT INTO THAT STATIC METHOD,WE CAN INTIALIZE THE STSIC VALUES
		// IN
		// IN THE MAIN METHOD BUT WE CANNOT PRINT THE VALUES.
	}

	public static void main(String[] args) {

		Task3 n = new Task3();

		n.Voop(23, 22);
		Task3.s1 = s1 + s2;
		Fero(12.3f, 3.65f);
//	System.out.println(s1); HERE WE CANNOT PRINT 
		System.out.println(n.x);// AFTER ADDING THIS KEY WORD TO THE FUCTION
		// IT MAKES THE VALUE OF X IS ZERO AND PRINTS THHE VALUE OF "Y";
		System.out.println(n.y);
	}

}
