package day25;
//Thread is a process(like a method)
//multithreading is a multiple process executing at a same time.

//one way using extends Thread by start and run but disadvantage is we cant use multiple inheritance at extends so Runnable

//2nd step using Runnable, by implementing Runnable and creating object for thread and pass Class(ex1) into constructor

//Runnable is most prefferable
class Example1 extends Thread{
	@Override
	public void run() {
		for(int i =0; i<=50; i++) {
			System.out.println("Example1 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Example2 extends Thread{
	@Override
	public void run() {
	for(int i =0; i<=50; i++) {
		System.out.println("Example2 : " + i);
		try {
			Thread.sleep(800);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

class Example3  implements Runnable  {
	public void run() {
		for(int i =1; i<=50; i++) {
			System.out.println("Example 3 :" + i);
		}
	}
}


public class ThreadEx {
	public static void main(String[] args) {
		
	
	Example1 ex1 = new Example1();
	Example2 ex2 = new Example2();
	Example3 ex3 = new Example3();
	
	Thread T1 = new Thread(ex3);
	
	T1.start();
	ex1.start();
	ex2.start();
	

}
}
