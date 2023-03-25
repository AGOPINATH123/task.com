package task.com;
//PRINTING THE PRIME NUMBERS 
public class Task1 {  

	public static void main(String[] args) {
		int no=50;
    int count =0;
    
  for (int i=1;i<=50;i++) {
	  count =0;
    	for(int j=1;j<=i;j++) {
    		if(i%j==0) {
    		count ++;
    		}
    	    	
    	}
    	if(count==2) {
    		System.out.println(i);
	}

    }
  System.out.println();
 /*   for (int i=2;i<=no-1;i++) {
    	if(no%i==0) {
    		count++;
    	}}
    	if(count==0) {
    		System.out.println(no+" is a prime number");
    	}
    	else {System.out.println(no +"is not a prime number");
    }
    */
  
  int num =89654335; //53345698
//89654
  
  int rem,rev=0; 
  
  while (num!=0) {
	  rem=num%10;
	  rev=rev*10+rem;
	  num=num/10;
	 
	  
  }
  System.out.println(rev);
  
		
		
	}}


		
	

	


