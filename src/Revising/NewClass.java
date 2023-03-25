package Revising;

public class NewClass {
	public static void AsciiCode() {
		String xg="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String xg1="abcdefghijklmnopqrstuvwxyz";
		char []ch=xg.toCharArray();
		char []ch1=xg1.toCharArray();		
		for(int i=0;i<xg.length();i++) {
			System.out.print(ch[i]+"-"+(int)ch[i]+" ;");			
		}
		System.out.println();
		for(int j=0;j<xg1.length();j++) {
			System.out.print(ch1[j]+"-"+(int)ch1[j]+" ;");
		}
	}
	public static void IntegerLetterConvert() {
		int n =2;
        int sum = n + (n * 11) + (n * 111);
        System.out.println("Sum of " + n + "+" + n + n + "+" + n + n + n + " is " + sum);
    }
public static void OddNumbers() {
	for(int i=1;i<=20;i++) {
		if(i%2==1)System.out.print(i+"\t");
		else if(i%2==0)System.out.println(i+" ");	
	}
}
public static void ConvertingStringToInteger() {
	String gh="hello";
	String hk="200000";
	char []h=gh.toCharArray();
	/*for(int i=0;i<gh.length();i++) {
		System.out.print((int)h[i]);
	}*/
	long result=Long.parseLong(hk);
	System.out.println(result);
}
		
		
	  

	public static void main(String[] args) {
		 ConvertingStringToInteger() ;
		//AsciiCode() ;
		OddNumbers();
		System.out.println();
		//IntegerLetterConvert() ;
		System.out.printf("Current date  time today  %tc%n\n",System.currentTimeMillis());
	
		//System.out.println(System.getProperty("hello"));
	}

}
