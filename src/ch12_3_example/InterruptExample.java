package ch12_3_example;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {Thread.sleep(1000);} catch (Exception e) {}
		
		// 스레드를 종료하기 위해 InterruptedException을 발생시킨다.
		thread.interrupt();
	}
}
