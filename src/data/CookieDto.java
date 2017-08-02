package data;

public class CookieDto {
	int code, amount;
	String name;
	int shrimp, potatoe;
	public int getCode() {
		return code;
	}
	public int getShrimp() {
		return shrimp;
	}
	public void setShrimp(int shrimp) {
		this.shrimp += shrimp;
	}
	public int getPotatoe() {
		return potatoe;
	}
	public void setPotatoe(int potatoe) {
		this.potatoe += potatoe;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
