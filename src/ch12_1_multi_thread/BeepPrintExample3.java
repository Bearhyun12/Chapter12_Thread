package ch12_1_multi_thread;

import java.awt.Toolkit;

public class BeepPrintExample3 {
public static void main(String[] args) {
	
//	Thread th1 = new Thread(new Task1());
//	Thread th2 = new Thread(new Task2());
	
	Thread th1 = new Thread() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
		}
	};
	Thread th2 = new Thread(new Runnable() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	});
	th1.start();
	th2.start();
}
}
