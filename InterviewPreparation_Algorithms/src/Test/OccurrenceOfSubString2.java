package Test;

//import org.apache.commons.lang3.StringUtils;

//Number of Characters occurance "abbbccd"
public class OccurrenceOfSubString2 {

	public static void main(String[] args) {
		 
        String text = "abbbccdkjdfhajflabbbccdlskfalkjlabbbccdlkDabbbccd";
        String str = "abbbccd";
 
        int count = countMatches(text, str);
        System.out.println(count);
    }
	
	public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
 
    public static int countMatches(String text, String str) {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
 
        int index = 0, count = 0;
        while (true) {
            index = text.indexOf(str, index);
            if (index != -1) {
                count ++;
                index += str.length();
            } else {
                break;
            }
        }
 
        return count;
    }

}
