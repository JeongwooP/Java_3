package pack_io;

import java.io.BufferedReader;	
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FileIOTest2 {
	// 2byte 단위로 자료 입출력 (일반 텍스트파일 처리에 효과적)
	public void write_file(File file, ArrayList<String> str_list) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for(String str:str_list){
				writer.write(str, 0, str.length());
				writer.newLine();
			}
			writer.close();
			System.out.println("2바이트 단위 파일 저장 성공");
		} catch (Exception e) {
			System.out.println("read_file err:" + e.getMessage());
		}
		
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));

			for (String str : str_list) {
				writer.write(str, 0, str.length());
				writer.newLine(); // 줄바꿈
			}
			writer.close();
			System.out.println("저장 완료");
		} catch (Exception e) {
			System.out.println("write_file err:" + e.getMessage());
		}
	}

	public void read_file(File file) {
		try {
			StringBuffer buffer = new StringBuffer();
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String one_line;
			while((one_line = reader.readLine()) != null){
				buffer.append(one_line + "\n"); 
			}
			System.out.println(buffer.toString());	//버퍼에 내용 출력
			reader.close();
			
		} catch (Exception e) {
			System.out.println("read_file err:" + e.getMessage());
		}
	}


	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("하하하2");
		list.add("abc2");
		File file = new File("c:/work/abc2.txt");

		FileIOTest2 test1 = new FileIOTest2();
		test1.write_file(file, list);
		test1.read_file(file);
	}

}
