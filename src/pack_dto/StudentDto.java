package pack_dto;

public class StudentDto {
	// 레코드형(행) 단위의 기억장소(DTO)
	private String hakbun, irum;
	private int jumsu, Kr, en;

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getIrum() {
		return irum;
	}

	public void setIrum(String irum) {
		this.irum = irum;
	}

	public int getJumsu() {
		return jumsu;
	}

	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}

	public int getKr() {
		return Kr;
	}

	public void setKr(int kr) {
		this.Kr = kr;
	}

	public int geten() {
		return en;
	}

	public void seten(int en) {
		this.en = en;
	}

}
