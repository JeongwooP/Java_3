package pack_dto;

import java.util.ArrayList;

public class DtoTest1 {
	ArrayList<StudentDto> list = new ArrayList<>();

	public void aa() {
		String[] persons = new String[3];
		persons[0] = "홍길동";
		persons[1] = "고길동";
		persons[2] = "신길동";

		for (String p : persons) {
			System.out.println(p);
		}
	}

	public void insertData() {
		StudentDto dto = null;

		dto = new StudentDto();
		dto.setHakbun("ks1");
		dto.setIrum("손오공");
		dto.setJumsu(88);
		list.add(dto); // 1명의 학생 자료가 컬렉션에 저장

		dto = new StudentDto();
		dto.setHakbun("ks2");
		dto.setIrum("저팔계");
		dto.setJumsu(76);
		list.add(dto); // 2명

		dto = new StudentDto();
		dto.setHakbun("ks3");
		dto.setIrum("사오정");
		dto.setJumsu(100);
		list.add(dto); // 3명
	}

	public void showData() {
		System.out.println("학생 수는 " + list.size() + "명");
		for (int i = 0; i < list.size(); i++) {
			StudentDto dto = new StudentDto();
			// dto = (StudentDto)list.get(i);
			dto = list.get(i);
			System.out.println(dto.getHakbun() + " " + dto.getIrum() + " " + dto.getJumsu());
		}
	}

	public static void main(String[] args) {
		DtoTest1 test1 = new DtoTest1();
		test1.aa();
		System.out.println();
		test1.insertData();
		System.out.println("이런 저런 작업을 하다가...학생자료 출력");
		test1.showData();
	}
}
