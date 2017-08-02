package pack;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// Vector : 순서o, 중복o
		Vector<Object> v = new Vector<>();
		
		v.add('a');
		v.addElement("한국인");
		v.add(100);
		v.add(123.456);
		VectorTest test = new VectorTest();
		v.add(test);
		System.out.println(v.size());
		System.out.println(v.get(1));
		System.out.println(v.elementAt(1));
		v.remove(0);
		//v.removeElementAt(0);
	
		for(Object obj:v){
			System.out.println(obj);
		}
	}

}
