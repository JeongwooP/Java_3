package pack_thread;

public class ThreadTest2 implements Runnable{
	public ThreadTest2() {
		
	}
	public ThreadTest2(String name) {
		Thread tt = new Thread(this, name);
		tt.start(); //run()호출
	}
	
	@Override
	public void run() {
		for(int i = 0; i <= 50; i++){
			System.out.println(i + Thread.currentThread().getName());
		}
		
	}
	
	public static void main(String[] args) {
		/*
		ThreadTest2 aa1 = new ThreadTest2();
		ThreadTest2 aa2 = new ThreadTest2();
		Thread t1 = new Thread(aa1, "one");
		Thread t2 = new Thread(aa2, "two");
		t1.start();
		t2.start();
		*/
		new ThreadTest2("하나");
		new ThreadTest2("둘");
		
		System.out.println("프로그램 끝");
	}

}
