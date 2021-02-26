package interviews.EY.MorganStanley;

public class ThreadContinuation {
	  final static int MAX_NUMBERS = 30;
	  public static void main(String[] args) {
	    // shared object
	    ThreadContinuation obj = new ThreadContinuation();
	    // Creating 3 threads
	    Thread t1 = new Thread(new NumberRunnable(obj, 0), "T1");
	    Thread t2 = new Thread(new NumberRunnable(obj, 1), "T2");
	    Thread t3 = new Thread(new NumberRunnable(obj, 2), "T3");
	    t1.start();
	    t2.start();
	    t3.start();
	  }
	}

	class NumberRunnable implements Runnable{
	  ThreadContinuation obj;
	  int threadNumber;
	  static int number = 0;
	  static int num=30;
	  NumberRunnable(ThreadContinuation obj, int result){
	    this.obj = obj;
	    this.threadNumber = result;
	  }
	  @Override
	  public void run() {
		  int num=30;
	    while (number < ThreadContinuation.MAX_NUMBERS) {
	      synchronized(obj) {	
	        // check again for (number < PrintNumbers.MAX_NUMBERS) otherwise one more number my be
	        // printed by another thread
	        if(number % 3 == threadNumber && number < ThreadContinuation.MAX_NUMBERS){
	          System.out.println(Thread.currentThread().getName() + " - " + ++num);
//	        	for(int i =0 ; i < num/6 ;i++) {
//	        		System.out.println(Thread.currentThread().getName() + " - " + ++num);
//	        	}
	        	
	        }
	      }
	    }                             
	  }
	}
