package pack;

import java.io.FileReader;

public class TryTest {
	public void test(){
		//지역 예외처리가 우선한다
		try {
			int[] a = {1,2,3};
			//System.out.println("배열항목 출력: " + a[5]);
			System.out.println("배열항목 출력: " + a[1]);
		} catch (Exception e) {
			System.out.println("배열 처리 중 오류: " + e);
		}
	}
	
	public void test2() throws Exception{
		int[] a = {1,2,3};
		System.out.println("배열항목 출력: " + a[1]);
	}
	
//	public static void main(String[] args) throws Exception{
	public static void main(String[] args) {		//키보드, 파일, 네트워크, 데이터베이스는 예외처리(Exception)를 요구한다.
		//FileReader fr = new FileReader("c:/work/aa.txt");
		
		try {   
			int re = 10 / 2;
			//int re = 10/0;
			System.out.println("re:" + re);
			
			TryTest tt = new TryTest();
			//TryTest tt = null;
			tt.test();
			tt.test2();
			
			//FileReader fr = new FileReader("c:/work/aa.txt");
		} catch (ArithmeticException e) {
			System.out.println("연산 오류:" + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("참조 오류:" + e.getMessage());
		} catch (Exception e){
			System.out.println("처리 오류:" + e);
		} finally{
			System.out.println("에러 유무와 관계없이 반드시 수행");
		}
		
		System.out.println("프로그램 종료");
	}

}
