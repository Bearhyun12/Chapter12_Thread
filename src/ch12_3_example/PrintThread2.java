package ch12_3_example;

public class PrintThread2 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	@Override
	public void run() {
		try {
			while(!stop) {
				System.out.println("���� ��");
				// �����尡 ������, ���� �����϶��� ���ܰ� �߻�X
				// �����尡 �Ͻ�����(sleep)���°� ���� ������, interrupt()�� ���ǹ��ϴ�.	
				Thread.sleep(1);
			}
		} catch (Exception e) {}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
