package ch12_3_example;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {Thread.sleep(1000);} catch (Exception e) {}
		
		// �����带 �����ϱ� ���� InterruptedException�� �߻���Ų��.
		thread.interrupt();
	}
}
