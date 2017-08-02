package data;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class RunEmployee {
	ArrayList<EmployeeDto> E = new ArrayList<>();

	public void dataBase(String[] args) {
		for (int i = 0; i < args.length; i++) {
			StringTokenizer token = new StringTokenizer(args[i], ",");
			int number = Integer.parseInt(token.nextToken());
			String name = token.nextToken();
			int standard = Integer.parseInt(token.nextToken());
			int date = Integer.parseInt(token.nextToken());

			EmployeeDto Dto = new EmployeeDto();
			Dto.setNumber(number);
			Dto.setName(name);
			Dto.setStandard(standard);
			Dto.setDate(date);
			E.add(Dto);

		}
	}

	public void print() {
		System.out.println("사번\t이름\t기본급\t근무년수\t근속수당\t공제액\t\t수령액");
		for (EmployeeDto Dto : E) {
			int year = 2017 - Dto.getDate();
			int service = 0;
			if (year < 9) {
				if (year > 4) {
					service = 450000;
				} else if (year >= 0) {
					service = 150000;
				}
			} else if (year >= 9) {
				service = 1000000;
			}

			double deduct = (Dto.getStandard() - service) * 0.5;
			double receipt = Dto.getStandard() + service - deduct;

			System.out.println(Dto.getNumber() + "\t" + Dto.getName() + "\t" + Dto.getStandard() + "\t" + year + "\t"
					+ service + "\t" + deduct + "\t" + receipt);
		}
	}

	public static void main(String[] args) {
		RunEmployee run = new RunEmployee();
		run.dataBase(args);	
		run.print();
	}

}
