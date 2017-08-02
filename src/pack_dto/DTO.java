package pack_dto;

import java.util.ArrayList;
import java.util.Scanner;

public class DTO {
	ArrayList<StudentDto> list = new ArrayList<>();

	public void Set() {
		aa: while (true) {
			StudentDto student = null;
			student = new StudentDto();

			Scanner sc = new Scanner(System.in);
			System.out.println("이름: ");
			String name = sc.next();
			System.out.println("국어 점수: ");
			int kr = sc.nextInt();
			System.out.println("영어 점수");
			int en = sc.nextInt();

			student.setIrum(name);
			student.setKr(kr);
			student.seten(en);

			list.add(student);

			while (true) {
				System.out.println("계속할까요? Y/N");
				String answer = sc.next();
				if (answer.equals("N")) {
					break aa;
				} else if (answer.equals("Y")) {
					continue aa;
				} else {
					continue;
				}

			}
		}

	}

	public void Data() {
		System.out.println("이름" + "   " + "국어" + "   " + "영어" + "   " + "총점");
		for (int i = 0; i < list.size(); i++) {
			StudentDto student = new StudentDto();
			student = list.get(i);
			System.out.println(student.getIrum() + " " + student.getKr() + " " + student.geten() + " "
					+ (student.getKr() + student.geten()));
		}
		System.out.println("응시인원 " + list.size() + "명");
	}

	public static void main(String[] args) {
		DTO d = new DTO();
		d.Set();
		d.Data();
	}
}
