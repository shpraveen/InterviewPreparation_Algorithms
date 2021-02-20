package interviews.IHS_Markit;

public class Sequence implements Runnable{
	
	public int printNumber=20;
	int remainder=1;
	static int num=1;
	static Object lock = new Object();

	
	public Sequence(int remainder) {
		super();
		this.remainder = remainder;
	}


	@Override
	public void run() {
		System.out.println("Inside Run");
	while(num< printNumber) {
		System.out.println("Inside while");
		synchronized(lock){
		if(num%2!=remainder) {
			System.out.println("insdie lock");
			System.out.println("Thread Name:"+Thread.currentThread().getName() +" : "+num);
			num++;
			}
		else {
			System.out.println("insdie lock");
			System.out.println("Thread Name:"+Thread.currentThread().getName() +" : "+num);
			num++;
		}
		}
	}
		
	}

//	public static void main(String[] args) {
//		
//
//	}

	
	
	
}
