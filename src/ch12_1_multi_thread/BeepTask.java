package ch12_1_multi_thread;

import java.awt.Toolkit;

import javax.tools.Tool;

public class BeepTask implements Runnable {

	Toolkit toolkit = Toolkit.getDefaultToolkit();
@Override
public void run() {
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		}
	}
}
