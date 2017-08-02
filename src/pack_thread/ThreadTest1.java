package pack_thread;
//public class ThreadTest1 {
	public class ThreadTest1 extends Thread{
	// 하나의 프로그램은 하나의 process에 해당한다.
	// 이 프로그램을 실행하기 위해 main thread가 활동한다.
	// 여러 개의 메소드를 동시에 실행하는 것 처럼 보이기 위해
	// 여러 개의 스레드를 사용할 수 있다.
	
	public ThreadTest1() {
		
	}
	
	public ThreadTest1(String name) {
		super(name);
	}
	
	public void run() {
		for (int i = 0; i <= 50; i++) {
			//System.out.print(i + " ");
			System.out.print(i + ":" + super.getName() + " ");
			try {
				Thread.sleep(500);	//0.5초 간 스레드를 비활성화
			} catch (Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			// process 단위의 수행
			/*
			 * Process p1 = Runtime.getRuntime().exec("calc.exe"); Process p2 =
			 * Runtime.getRuntime().exec("notepad.exe"); p1.waitFor();
			 * p2.destroy(); System.out.println("p1:" + p1.exitValue());
			 * System.out.println("p2:" + p2.exitValue());
			 */
			
			/*
			 * ThreadTest1 t1 = new ThreadTest1(); ThreadTest1 t2 = new
			 * ThreadTest1(); t1.run(); //순차적 t2.run();
			 */
			
			//thread 사용
			 //ThreadTest1 t1 = new ThreadTest1();
			ThreadTest1 t1 = new ThreadTest1("one"); 
			ThreadTest1 t2 = new ThreadTest1("two");
			//ThreadTest1 t2 = new ThreadTest1();
			 t1.start(); //run()호출
			 t2.start();
			 
			 //t2.setPriority(9);
			 t2.setPriority(MAX_PRIORITY);
			 Thread.yield(); //다른 스레드의 수행요청이 있으면 현재 스레드의 수행을 일시 정지
			 
			 t1.join();	//현재 스레드의 수행 종료까지 메인 스레드를 대기
			 t2.join();	//
			 
			 System.out.println("프로그램 종료");
		} catch (Exception e) {
			System.out.println("err: " + e);
			e.printStackTrace();
		}
		
		ThreadTest1 t1 = new ThreadTest1();
	}
	
}

