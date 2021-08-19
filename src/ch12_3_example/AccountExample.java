package ch12_3_example;

class Withdrawer implements Runnable {
	
    Account account = new Account(); //has a..관계 (하나의 부품으로 갖고있다)
	@Override
	public void run() {
		// 출금하기
		while(account.getBalance() > 0) {
			// 100, 200 , 300중 임의로 출금
			int money = ((int)Math.random()*3 + 1)* 100;
			account.withdraw(money);
			System.out.println("현재잔고: " + account.getBalance());
			
		}
	}
}
public class AccountExample {

	public static void main(String[] args) {
		/*
		 * 출금하는 일을 병렬화(멀티 스레딩 구성 해야한다는 뜻(여러명이서 돈을 뺀다))
		 * 
		 */
		Runnable withdrawer = new Withdrawer();
		
		Thread jWorker = new Thread(withdrawer);
		Thread yWorker = new Thread(withdrawer);
		
		jWorker.start();
		yWorker.start();
	}

}
