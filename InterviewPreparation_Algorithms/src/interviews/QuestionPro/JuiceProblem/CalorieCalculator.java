package interviews.QuestionPro.JuiceProblem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class CalorieCalculator {
	
	private void juiceCombination(Map<Character, Integer> outputMap, int caloriIntake){
		int count =0;
		String finalOutPut = "";
		for (Map.Entry<Character, Integer> entry : outputMap.entrySet())
		{
			if (outputMap.containsValue(caloriIntake)){				
				System.out.println(entry.getKey());				
			}else if (entry.getValue() < caloriIntake){
				count += entry.getValue();
				finalOutPut += entry.getKey();
			}
		}
		if (count == caloriIntake){
			System.out.println(finalOutPut);
			
		}else{
			System.out.println("SORRY, YOU JUST HAVE WATER");
		}
	}
	
	
	private Map<Character, Integer> individualInputList(String uniqueCaories, String actualFruit){
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		List<Character> uniqueFruitList = new ArrayList<Character>();
		
		String [] delimatedString = uniqueCaories.split(" ");

        char[] chars = actualFruit.toCharArray();
        Arrays.sort(chars);
        Set<Character> uniqKeys = new TreeSet<Character>();
        for(char eachChar : chars) {
        	uniqKeys.add(eachChar);
        }
        
        for (Character character : uniqKeys) {
			uniqueFruitList.add(character);
		}
        
        for (int i=0 ; i < uniqueFruitList.size();i++){
        	
        	map.put(uniqueFruitList.get(i), Integer.parseInt(delimatedString[i+1]));
        }
		return map;
	}
	
	public static void main(String[] args)
    {
		int invitedFriendCount=0;
		int iterationCount=0;
		int calorieIntake=0;
		int getListCount=1;
		
		InputFileReader file = new InputFileReader();
		CalorieCalculator calculateCalorie = new CalorieCalculator();
		
		List<String> list = file.readInputLines();
		invitedFriendCount=Integer.parseInt(list.get(0));
		
		while(invitedFriendCount > iterationCount) {
			
			calorieIntake = Integer.parseInt(list.get(3*getListCount));
			
			Map<Character, Integer> outputMap =  calculateCalorie.individualInputList(list.get(1+(iterationCount*3)), list.get(2+(iterationCount*3)));
			calculateCalorie.juiceCombination(outputMap, calorieIntake);
			iterationCount++;
			getListCount++;
			
			
		}
    }
}
