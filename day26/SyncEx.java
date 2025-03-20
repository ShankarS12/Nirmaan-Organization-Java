package day26;


 class Example{
	int num = 0;
	 void inc() {
		num++;
	}
}
public class SyncEx {
	public static void main(String[] args) {
		
	
	Example ex = new Example();
	
	Thread Tr = new Thread() {
		public void run() {
			for(int i = 1; i<=100; i++) {
				ex.inc();
			}
		}
	};
	
	Thread Tr1 = new Thread() {
		public void run() {
			for(int i = 1; i<=100; i++) {
				ex.inc();
			}
		}
	};
	Tr.start();
	Tr1.start();
	
	try {
		Tr.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(ex.num);
}
}
