package interviews.EY;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingString {
	public static char getFirstNonRepeatingString(String str) {
		char returnChar = 0;
		Map<Character,Integer> counts = new LinkedHashMap<Character,Integer>();		
		for(char c :str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c)+1:1);
		}
		for(Map.Entry<Character, Integer> entry : counts.entrySet()) {
			if(entry.getValue() == 1) {
				returnChar= entry.getKey();
				break;
			}
		}
		System.out.println(returnChar);
		return returnChar;
	}
	public static void main(String[] args) {
		getFirstNonRepeatingString("JJohn Doe");
		
	}

}
