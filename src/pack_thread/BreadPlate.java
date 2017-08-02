package pack_thread;

public class BreadPlate {
	private int breadCount = 0;	//공유 대상
	
	public BreadPlate() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void makeBread(){
		if(breadCount >= 10){
			try {
				System.out.println("빵생산 초과");
				wait();	//스레드를 비활성화
			} catch (Exception e) {
				
			}
		}
		breadCount++;	//빵생산
		System.out.println("빵을 만듦. 총" + breadCount + "개");
		notify();
	}
	
	public synchronized void eatBread(){
		if(breadCount < 1  ){
			try {
				System.out.println("빵이 없어 기다림");
			} catch (Exception e) {
				
			}
		}
		breadCount--;	//빵소비
		System.out.println("빵을 먹음. 총" + breadCount + "개");
		notify();
	}
	
	
}
