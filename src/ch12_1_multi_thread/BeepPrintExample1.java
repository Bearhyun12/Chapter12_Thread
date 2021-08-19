package ch12_1_multi_thread;

import java.awt.Toolkit;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("나의 윈도우 프레이");
		setVisible(true);
	}
}
public class BeepPrintExample1 {
public static void main(String[] args) {
	/**
	 * 0.5초 주기로 beep음 발생 후 문자 출력
	 */
	Toolkit toolkit = Toolkit.getDefaultToolkit();
//	new MyFrame();
	for (int i = 0; i < 5; i++) {
	 toolkit.beep();
	 try {Thread.sleep(1000);} catch(Exception e) {}}
	
	for (int i = 0; i < 5; i++) {
		System.out.println(i+1 + ".띵~");
		try {Thread.sleep(1000);
		}catch (Exception e) {}
	}

}
}
