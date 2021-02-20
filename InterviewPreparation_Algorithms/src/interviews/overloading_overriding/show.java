package interviews.overloading_overriding;

import java.util.HashSet;
import java.util.Set;

class show {
    
    private static Set<String> availableSeats;
    private static /*volatile*/ show INSTANCE;
    
    private show() {
        availableSeats=new HashSet<String>();
        availableSeats.add("1A");
        availableSeats.add("2A");
        availableSeats.add("3A");
        availableSeats.add("3B");
        availableSeats.add("3C");
        availableSeats.add("4A");
        availableSeats.add("4B");
        availableSeats.add("4C");
        availableSeats.add("4D");
        availableSeats.add("4E");
        availableSeats.add("8A");
        availableSeats.add("8B");
        availableSeats.add("8C");
        availableSeats.add("8D");
        availableSeats.add("8E");
    }
    
    public static synchronized show getInstance() {
        if (INSTANCE == null) {
            synchronized (show.class) {
                if (INSTANCE == null) {
                	INSTANCE = new show();
                }
            }
        }
        return INSTANCE;
    }
    
    /*
     * declare a function 
     * bookSeat(String seat)
     *  this function will return a boolean result after the follwing seat is removed.
     */
    
    public boolean bookSeat(String seat){
    	
    	if(availableSeats.contains(seat)) {
    		availableSeats.remove(seat);
    		System.out.println(availableSeats);
    		return true;
    	}else {
    	return false;
    	}
    }
    
    public static void main(String args[])
    {

        show s=show.getInstance();
        show p=show.getInstance();

        System.out.println( s.bookSeat("1A"));
        System.out.println( p.bookSeat("1A"));
        System.out.println( s.bookSeat("2A"));
        System.out.println( p.bookSeat("2A"));
    }
    
    
}