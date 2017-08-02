package pack;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// Map 류의 HashMap : 자료들 키와 값으로 만들어 저장. 검색에 편리
		//HashMap<Integer, String> list = new HashMap<>();
		HashMap<String, String> list = new HashMap<>();
		list.put("1", "lee");
		list.put("이", "kim");
		list.put("3", "park");
		list.put("4", "choi");
		list.put("5", "han");
		System.out.println(list.size());
		System.out.println(list.containsKey("2"));
		System.out.println(list.containsKey("3"));
		System.out.println(list.containsValue("kim"));
		list.remove("3");
		
		
		
		Set set = list.keySet();	//키값을 Set type에게 전달
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			System.out.println(key + " " + list.get(key));
		}
	}

}
