package pack_dto;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class DtoTest2 {
	ArrayList<HaksaengDto> list;

	public DtoTest2() {
		list = new ArrayList<>();
	}

	public void inputData(String[] datas) {
		// 문자열 자르기
		String ss = "kbs, mbc, sbs";

		// 방법1
		/*
		 * String imsi[] = new String[3]; imsi = ss.split(",");
		 * System.out.println(imsi[0] + " " + imsi[1] + " " + imsi[2]);
		 */
		// 방법2
		/*
		 * StringTokenizer tokenizer = new StringTokenizer(ss, ","); String s1 =
		 * tokenizer.nextToken(); String s2 = tokenizer.nextToken(); String s3 =
		 * tokenizer.nextToken(); System.out.println(s1 + " " + s2 + " " + s3);
		 */
		
		for (int i = 0; i < datas.length; i++) {
			StringTokenizer tok = new StringTokenizer(datas[i], ",");
			String irum = tok.nextToken();
			int kor = Integer.parseInt(tok.nextToken());
			int eng = Integer.parseInt(tok.nextToken());
			int mat = Integer.parseInt(tok.nextToken());
			//System.out.println(irum + " " + kor);
			HaksaengDto dto = new HaksaengDto();
			dto.setName(irum);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMat(mat);
			list.add(dto);
			
		}
	}

	public void printData() {	
			System.out.println("이름\t총점\t평균");
			
			for(HaksaengDto dto:list){
				int tot = dto.getKor() + dto.getEng() + dto.getMat();
				int avg = tot / 3;
				System.out.println(dto.getName() + "\t" + tot + "\t" + avg);
			}
	}

	public static void main(String[] args) {
		String[] datas = new String[3];
		datas[0] = "김밥,100,100,100";
		datas[1] = "공기밥,90,80,85";
		datas[2] = "주먹밥,100,90,82";

		DtoTest2 test2 = new DtoTest2();
		test2.inputData(datas); // 입력
		test2.printData(); // 출력
	}

}
