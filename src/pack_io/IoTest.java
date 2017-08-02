package pack_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class IoTest {

	public static void main(String[] args) throws Exception {
		// console을 톻한 입출력
		/*
		 * InputStreamReader in = new InputStreamReader(System.in);
		 * BufferedReader br = new BufferedReader(in);
		 * System.out.print("이름입력:"); String irum = br.readLine();
		 * System.out.print("나이입력:"); //int nai = br.read(); //int nai =
		 * Integer.parseInt(br.readLine()); String nai = br.readLine();
		 * System.out.println("이름은 " + irum + ", 나이는 " + nai); in.close(); //자원
		 * 해제 br.close();
		 */
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("이름입력:"); String irum = scanner.nextLine(); // abc
		 * def System.out.println("나이입력:"); int nai = scanner.nextInt();
		 * System.out.println("몸무게 입력:"); double weight = scanner.nextDouble();
		 * System.out.println("이름은" + irum + ", 나이는 " + nai + ", 몸무게는 " +
		 * weight);
		 */
		
		//파일단위 작업
		try {
		System.out.println("파일로 출력");
		//File f= new File("c:\\work\\iotest.txt");
		File f = new File("c:/work/iotest.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw1 = new BufferedWriter(fw);
		PrintWriter out1 = new PrintWriter(bw1);
		out1.println(123);
		out1.println("자바로 출력");
		out1.println("abc");
		out1.close();
		bw1.close();
		fw.close();
		System.out.println("파일 저장 성공");
		} catch (Exception e) {
			System.out.println("파일 저장 실패!");
		}
		
		try {
			System.out.println("파일로 읽기");
			File f2 = new File("c:/work/First.java");
			FileReader fr = new FileReader(f2);
			BufferedReader br1 = new BufferedReader(fr);
			while(true){
				String str = br1.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			br1.close();
			fr.close();
		} catch (Exception e) {
			System.out.println("파일 읽기 실패!");
		}
	}

}
