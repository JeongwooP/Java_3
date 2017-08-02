package data;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RunCookie extends CookieDto {
	ArrayList<CookieDto> C = new ArrayList<>();

	public void scan() {
		Scanner sc = new Scanner(System.in);
		aa: while (true) {
			System.out.println("입력하세요.");
			String str = sc.next();
			StringTokenizer token = new StringTokenizer(str, ",");
			int code = Integer.parseInt(token.nextToken());
			String name = token.nextToken();
			int amount = Integer.parseInt(token.nextToken());

			CookieDto Dto = new CookieDto();
			Dto.setCode(code);
			Dto.setName(name);
			Dto.setAmount(amount);
			if (name.equals("감자깡")) {
				Dto.setPotatoe(1);
			} else if (name.equals("새우깡")) {
				Dto.setShrimp(1);
				;
			}
			C.add(Dto);

			while (true) {
				System.out.println("계속하시겠습니까? y/n");
				String ans = sc.next();
				if (ans.equals("y")) {
					continue aa;
				} else if (ans.equals("n")) {
					break aa;
				} else {
					System.out.println("다시 입력해주세요");
					continue;
				}
			}

		}

	}

	public void print() {
		System.out.println("지역" + "\t" + "상품명" + "\t" + "수량" + "\t" + "단가" + "\t" + "금액");
		int POC = 0, SHC = 0;
		for (CookieDto Dto : C) {

			String location = "";
			int cost = 0;
			int total;

			if (Dto.getCode() == 100) {
				location = "강북";
			} else if (Dto.getCode() == 200) { // Dto.getCode()?
				location = "강남";
			} else if (Dto.getCode() == 300) {
				location = "강서";
			}

			if (Dto.getName().equals("새우깡")) {
				cost = 450;
			} else if (Dto.getName().equals("감자깡")) {
				cost = 300;
			}

			total = Dto.getAmount() * cost;

			System.out.println(location + "\t" + Dto.getName() + "\t" + Dto.getAmount() + "\t" + cost + "\t" + total);

			if (Dto.getPotatoe() != 0) {
				POC++;
			} else if (Dto.getShrimp() != 0) {
				SHC++;
			}
		}

		System.out.println("소계: " + "\t" + "감자깡: " + "\t" + POC + "\t" + "소계액: " + "\t" + (POC * 300));
		System.out.println("\t" + "새우강: " + "\t" + SHC + "\t" + "소계액" + "\t" + (SHC * 450));
		System.out.println("총 건수: " + "\t" + (SHC + POC) + "\t" + "총액" + "\t" + ((POC * 300) + (SHC * 450)));
	}

	public static void main(String[] args) {
		RunCookie cookie = new RunCookie();
		cookie.scan();
		cookie.print();

	}

}
