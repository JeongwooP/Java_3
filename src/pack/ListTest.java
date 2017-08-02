package pack;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// List 류의 ArrayList
		ArrayList<String> list = new ArrayList<>();	//순서가 있고, 중복이 가능
		list.add("kim");
		list.clear();
		list.add("kim");
		list.add("kim");
		list.add("lee");
		list.add("choi");
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.contains("lee"));
		list.remove("kim");
		list.remove(0);
		System.out.println(list.size());
		
		System.out.println();
		for(String ss:list){
			System.out.println(ss);
		}
		System.out.println();
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}
