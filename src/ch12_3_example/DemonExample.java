package ch12_3_example;

public class DemonExample {
	public static void main(String[] args) {
		
		AutoSaver auto = new AutoSaver(20);
		// 데몬스레드 설정
	    auto.setDaemon(true);
	    
	    if(auto.isDaemon()) {
	    	auto.start();
	    }
	    System.out.println("스레드 수: " + Thread.activeCount());
	    
	    try {
	    	Thread.sleep(5 * 1000);
	    } catch (Exception e) {}
          auto.print();
          
          System.out.println(Thread.currentThread().getName() + "종료");
	}
}
