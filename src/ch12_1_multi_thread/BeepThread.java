package ch12_1_multi_thread;

import java.awt.Toolkit;

class Task1 extends Thread {                     //规过1
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	//鞘靛 
	//积己磊
	//皋家靛
}

class Task2 implements Runnable {                //规过2

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class BeepThread extends Thread{
@Override
public void run() {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for (int i = 0; i < 5; i++) {
		toolkit.beep();
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
	}
}
}
