package pack_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BinaryProcess {
	public static void main(String[] args) throws Exception{
		BinaryData data = new BinaryData();
		
		//이진 자료로 저장
		//File f = new File("c:/work/iotest2.dat");
		File dir = new File("c:/work/");
		File file = new File(dir, "iotest2.dat");
		
		FileOutputStream fo = new FileOutputStream(file);
		BufferedOutputStream bo = new BufferedOutputStream(fo, 1024);
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(data);
		System.out.println("저장 성공");
		oo.close(); bo.close(); fo.close();
		
		System.out.println();
		File file2 = new File("c:/work/iotest2.dat");
		FileInputStream fis = new FileInputStream(file2);
		BufferedInputStream bi = new BufferedInputStream(fis, 1024);
		ObjectInputStream oi = new ObjectInputStream(bi);
		Object obj = oi.readObject();
		BinaryData data2 = (BinaryData)obj;
		System.out.println(data2.i);
		System.out.println(data2.d);
		System.out.println(data2.s1);
		System.out.println(data2.s2);
		oi.close(); bi.close(); fis.close();
	}

}
