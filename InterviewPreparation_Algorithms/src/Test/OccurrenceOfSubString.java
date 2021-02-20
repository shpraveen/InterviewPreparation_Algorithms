package Test;

import org.apache.commons.lang3.StringUtils;

//Number of Characters occurance "abbbccd"
public class OccurrenceOfSubString {

	public static void main(String[] args) {
		 
        String text = "abbbccdkjdfhajflabbbccdlskfalkjlabbbccdlkDabbbccd";
        String str = "abbbccd";
 
        int count = StringUtils.countMatches(text, str);
        System.out.println(count);
    }

}
