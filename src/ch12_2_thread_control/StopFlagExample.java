package ch12_2_thread_control;

public class StopFlagExample {
public static void main(String[] args) {
	PrintThread1 printThread = new PrintThread1();
	printThread.start();
	
	try {
		Thread.sleep(1 * 2000);
	}catch(InterruptedException e){}
	
	printThread.setStop(true);
}
}
