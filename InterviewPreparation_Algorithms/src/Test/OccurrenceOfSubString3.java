package Test;
public class OccurrenceOfSubString3 {

	public static void main(String[] args) {
		 
        String text = "abbbccdkjdfhajflabbbccdlskfalkjlabbbccdlkDabbbccd";
        String str = "abbbccd";
 
        int count = countMatches(text, str);
        System.out.println(count);
    }
	
	public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
 
    /* Counts how many times the substring appears in the larger string. */
    public static int countMatches(String text, String str) {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
 
        return text.split(str, -1).length - 1;
    }

}
