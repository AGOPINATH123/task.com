package Com.Gopi.NextPage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rogah {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String array[]= new String[4];
		//array[0]=sc.next();
		//array[2]=sc.next();
		Integer []aa= {1,2,3,4};
		Integer[] bb=new Integer [4];
		Map <String,Integer> map=new HashMap<>();

		map.put("a", 2000);
		map.put("b", 5000);
		map.put("", 500);
		map.put("d", 10000);	
		String gf="gopi natgh";
	String []jk= {sc.next(),sc.next(),sc.next()};
	Pattern p=Pattern.compile("[0-9]");
	Matcher m=null;
	
	for (int j = 0; j < jk.length; j++) {
		m=p.matcher(jk[j]);

	}
			while(m.find()) {
				 System.out.println(m.start());
			}
		
		
	
		map.containsKey("a");
		
		

			/* if(map.containsKey("a")) {
				for (Map.Entry<String, Integer> entry : map.entrySet()) {
					
					System.out.println(entry.getValue());
					
				}*/
				 
			 }
		}
		
		
		
		
		
		
		
		
	
	


