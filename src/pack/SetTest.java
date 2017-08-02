package pack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> list = new HashSet<>();	//중복 불가, 순서가 없다.
		list.add("lee");	//Boxing, UnBoxing
		//list.add(1);
		TryTest test = new TryTest();
		//list.add(test);
		list.add("lee");
		list.add("kim");
		list.clear();
		list.add("lee");
		list.add("kim");
		list.add("park");
		list.add("cho");
		
		System.out.println(list.size());
		list.remove("kim");
		System.out.println(list.size());
		
		print(list);
		print(list.toArray()); 
	}
	
	public static void print(Set set){
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			String str = (String)iterator.next();
			System.out.println(str);
		}
		
	
	}
	
	public static void print(Object[] obj){
		for(int i = 0; i < obj.length; i++){
			System.out.println(obj[i]);
		}
	}

}
