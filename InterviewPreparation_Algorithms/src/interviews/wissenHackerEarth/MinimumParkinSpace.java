package interviews.wissenHackerEarth;


//You are operating a paking lot. People come and park their cars for time they booked in advance.Each parking booking consists of start and end time.One parking space can hold one car at a time.Find out the minimum numer of parking space needed to accomadate all the bookings.
//
//        int minParkingSpace(int [][] parking start and end time){
//
//        params: start and end time of each parking. e.g.
//        [
//        [0,10],
//        [5,20]
//        ]
//
//        The first parking booking start at time=0 and ends at time=10,The second parking booking starts at time=5 and ends at time=20, 0<=time<=Integer.MAX_VALUE. The array is not sorted.
//
//        Returns: min number of parking required.
//
//        }
//
//        NOTE: If start of parking coincides with the end of another parking.You can cosider there is no extra space
//
//        Sample I/p:
//        4
//        5,10 0,20 25,40 35,45
//
//        Sample O/P: 2
//
//        Explanation:
//        We need two parking spaces since at any point of time there are at max two car parked
//
//        Space1:(0,20),(25,40)
//        Space 2:(5,10),(35,45)

public class MinimumParkinSpace {

    static int minParkingSpaces(int[][] parkingStartEndTimes) {
// YOUR CODE HERE
        int count = 0, i=0, j=parkingStartEndTimes.length-1;
        while(i<j){
            if((parkingStartEndTimes[i][0]<parkingStartEndTimes[j][0]) && (parkingStartEndTimes[i][1]<parkingStartEndTimes[j][1]) ){
                count++;
                i++;j--;
            }
            else{
                i++;
            }
        }
        return count;
    }



}
