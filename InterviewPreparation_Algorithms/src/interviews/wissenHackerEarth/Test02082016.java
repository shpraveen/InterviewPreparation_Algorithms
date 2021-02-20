package interviews.wissenHackerEarth;

import java.util.*;

public class Test02082016 {

    public static class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {
        @Override
        public void putNewInnings(String player, int runs){
            // YOUR CODE HERE
            
            if(player.equalsIgnoreCase("Virat_Kohli")){
            	runs=runs+runs;
            	
            }
			else if(player.equalsIgnoreCase("Steve_Smith")){
				runs=runs+runs;
                
            }
            
        }

        @Override
        public double getAverageRuns(String player){
        	double Avg=0.00;
        	int TotalRuns=0;
        	int InningsPlayed=0;
            if(player.equalsIgnoreCase("Virat_Kohli")){
                Avg= TotalRuns / (InningsPlayed); 
                return  Avg;
            }
            else if(player.equalsIgnoreCase("Steve_Smith")){
                Avg= TotalRuns / (InningsPlayed);  
                return  Avg;
            }
            else{
                return  0.00;
            }
        }

        @Override
        public int getInningsCount(String player){
        	int InningsPlayed=0;
            if(player.equalsIgnoreCase("Virat_Kohli")){
                InningsPlayed=InningsPlayed++;
                return  InningsPlayed;
            }
            else if(player.equalsIgnoreCase("Steve_Smith")){
                InningsPlayed=InningsPlayed++;
                return  InningsPlayed;
            }
            else{
                return  0;
            }

        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface PlayerStatisticsCollector {
        // This is an input. Make note of this player inning.  Runs is a non negative integer.
        void putNewInnings(String player, int runs);

        // Get the runs average(mathematical average) for a player
        double getAverageRuns(String player);

        // Get the total number of innings for the player
        int getInningsCount(String player);
    }

    public static void main(String[] args) {
    	System.out.println("Hi");
    	Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
            final Set<String> players = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String player = tokens[0];
                players.add(player);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewInnings(player, runs);

            }

            for (String player : players) {
                System.out.println(
                        String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
            }

        }
        scanner.close();

    }
}
