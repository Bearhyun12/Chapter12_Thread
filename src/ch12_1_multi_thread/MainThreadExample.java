package ch12_1_multi_thread;
class A extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
public class MainThreadExample {
public static void main(String[] args) {
	/** [��Ƽ�������� �����]
	 *  ���� - �۾�ȿ�� ����
	 *  ���� - ���� �����尡 ���� ���μ��� ������ �ڿ� �����ϸ� ����� ����
	 *  -����ȭ(synchronization)
	 *  -��������(deadlock)
	 */
	
	Calculator calculator = new Calculator();
	
	User1 user1 = new User1();
	user1.setCalculator(calculator);
	user1.start();
	
	User2 user2 = new User2();
	user2.setCalculator(calculator);
	user2.start();
	
	
	
	
}
}
