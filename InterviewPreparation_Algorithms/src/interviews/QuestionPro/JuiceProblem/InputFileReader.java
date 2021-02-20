package interviews.QuestionPro.JuiceProblem;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFileReader {
		String inputLine;
		public List<String> readInputLines(){
			
			List<String> list = new ArrayList<String>();
			try (BufferedReader br = new BufferedReader(new FileReader("sampleinput.txt"))) {
			    
				while ((inputLine = br.readLine()) != null) {
				    	list.add(inputLine);
				}
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//System.out.println("inputList: "+list);
			return  list;
		}
		
		
}
