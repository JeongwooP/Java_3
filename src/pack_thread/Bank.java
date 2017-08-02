package pack_thread;

public class Bank {
	private int money = 10000;	//공유될 자원
	
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	 
	//synchronized: 스레드 동기화 - 자원 공유
	public synchronized void saveMoney(int save){	//입금
		int m = this.getMoney();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		this.setMoney(m + save);
	}
	
	public synchronized void minusMoney(int mon){	//출금
		int m = getMoney();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		setMoney(m - mon);
	}
}
