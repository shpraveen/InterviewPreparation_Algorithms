package interviews.IHS_Markit;


@FunctionalInterface
public interface Test2 {
	
	int start();
	
	default int stop() {
		return 0;
	}
	
	static int call() {
		
		return 0;
	}

}
