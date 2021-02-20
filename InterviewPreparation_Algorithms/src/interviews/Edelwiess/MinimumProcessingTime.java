package interviews.Edelwiess;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


//number of processors n = 2
//10   →    processorTime = [8,10]
//4    →    number of tasks = 4
//10   →    taskTime = [10, 10, 10, 10]
//processorTime[10, 20]
//taskTime[2, 2, 3, 5, 6, 8]
//10

class Result {

    /*
     * Complete the 'minTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY processorTime
     *  2. INTEGER_ARRAY taskTime
     */

    public static int minTime(List<Integer> processorTime, List<Integer> taskTime) {
    // Write your code here
    	int minPossibleTime=0;
    	int noOfProcessor=processorTime.size();
    	int noOfTask=taskTime.size();
    	int taskcnt=0;
    	int processorcnt=0;
    	//System.out.println(noOfProcessor+"  "+noOfTask);
    	System.out.println("HI "+processorTime.get(processorTime.size()-1));
    	
    	Collections.sort(processorTime);
    	Collections.sort(taskTime);
    	
    	List<Integer> minTimeList = new ArrayList<>();
    	double avgProcessorTime=(processorTime.get(0)+(processorTime.get(processorTime.size()-1)))/2;
    	double avgTaskTime=(taskTime.get(0)+(taskTime.get(taskTime.size()-1)))/2;
    		
    	if(noOfTask > noOfProcessor) {
    		
    		while(taskcnt < noOfTask) {
    				
    				if(avgTaskTime < avgProcessorTime) {
    					
    					for(int i= 0; i<=noOfProcessor; i++) {
    						
    						minTimeList.add(taskTime.get(taskcnt)+processorTime.get((processorTime.size()-1)));
    						
    				}
    				
    			}
    			
    			taskcnt++;
    		}
    		
    		
    	}
    	
    	System.out.println(minTimeList);
    	 return minTimeList.get(minTimeList.size()-1);
    	//return 23;
    }

}

public class MinimumProcessingTime {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int processorTimeCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> processorTime = IntStream.range(0, processorTimeCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .map(String::trim)
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        int taskTimeCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> taskTime = IntStream.range(0, taskTimeCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .map(String::trim)
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        int result = Result.minTime(processorTime, taskTime);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    	
    	List<Integer> processorTime = new ArrayList<Integer>();
    	processorTime.add(10);
    	processorTime.add(20);
    	List<Integer> taskTime = new ArrayList<Integer>();
    	taskTime.add(3);
    	taskTime.add(2);
    	taskTime.add(5);
    	taskTime.add(8);
    	taskTime.add(2);
    	taskTime.add(6);
    	
    	int result = Result.minTime(processorTime, taskTime);
    	
    	System.out.println("processorTime"+processorTime);
    	System.out.println("taskTime"+taskTime);
    	System.out.println(result);
   }
}

