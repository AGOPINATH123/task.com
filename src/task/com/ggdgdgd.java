package task.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ggdgdgd  {
	synchronized public void run() {
		
	}
	public static void main(String[] args) {
		Map <String ,String> map=new HashMap<>();
		String str="This is Done By me ME and Mwe me me ME me me ME";
		String st[]=str.split("\\s");
		String st1[]=str.split("\\s");
		
		for (int i = 0; i < st.length; i++) {
				map.put(st[i], st1[i]);}
				
		 Set<Entry<String, String>> entrySet = map.entrySet();
         
	        for (Entry<String, String> entry : entrySet) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }       
			
		
		
			}
			
}