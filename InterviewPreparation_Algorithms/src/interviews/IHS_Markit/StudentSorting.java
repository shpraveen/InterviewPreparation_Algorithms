package interviews.IHS_Markit;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StudentSorting {

	
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Sam", 56);
		hm.put("Peter", 50);
		hm.put("John", 12);
		hm.put("Sony", 21);
		hm.put("Ram", 35);
		hm.put("Shyam", 45);
		
	   List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>> (hm.entrySet());
	   System.out.println("before "+list);
	   
	   Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
		   
		   public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
			   
			   //return o1.getValue().compareTo(o2.getValue());
			   return o1.getValue().compareTo(o2.getValue());
		   }
		   
	   });
		
	   System.out.println("after "+list);
		
	}

}
