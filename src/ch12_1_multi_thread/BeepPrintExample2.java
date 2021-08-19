package ch12_1_multi_thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
public static void main(String[] args) {
	/**
	 * 1초 주기로 beep음 발생과 동시에 출력
	 */
	
	// 스레드
	Thread th = new Thread(new Runnable() {
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}
	});
	th.start();   //toolkit.beep 가 실행되는거
	
	
	for (int i = 0; i < 5; i++) {
       System.out.println(i+1 + ".띵~");
		 try {
			 Thread.sleep(1000);
		 } catch(Exception e) {}
		}
}
}
